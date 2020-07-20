import http from '../../plugins/http-common';

const state = {
  name: localStorage.getItem('name'),
  num: localStorage.getItem('num'),
  access_token: localStorage.getItem('access_token'),
  refresh_token: localStorage.getItem('refresh_token'),
};

let setLS = function(state) {
  localStorage.setItem('name', state.name);
  localStorage.setItem('num', state.num);
  localStorage.setItem('access_token', state.access_token);
  localStorage.setItem('refresh_token', state.refresh_token);
};

let clearLS = function() {
  localStorage.removeItem('name');
  localStorage.removeItem('num');
  localStorage.removeItem('access_token');
  localStorage.removeItem('refresh_token');
};

let setAx = function(state) {
  http.defaults.headers.common['AccessToken'] = state.access_token;
  http.defaults.headers.common['RefreshToken'] = state.refresh_token;
};

let clearAx = function() {
  delete http.defaults.headers.common['AccessToken'];
  delete http.defaults.headers.common['RefreshToken'];
};

const mutations = {
  SIGNIN(state, payload) {
    state.name = payload.name;
    state.num = payload.num;
    state.access_token = payload.access_token;
    state.refresh_token = payload.refresh_token;
    setLS(state);
    setAx();
  },
  SIGNOUT(state) {
    clearLS();
    clearAx();
    delete state.name;
    delete state.num;
    delete state.access_token;
    delete state.refresh_token;
  },
};

const actions = {
  signin(context, payload) {
    return context.commit('SIGNIN', payload);
  },
  signout(context) {
    return context.commit('SIGNIN');
  },
};

const getters = {
  name(state) {
    return {
      name: state.name,
    };
  },
  userData(state) {
    return {
      num: state.num,
      access_token: state.access_token,
      refresh_token: state.refresh_token,
    };
  },
};

export default {
  state,
  mutations,
  actions,
  getters,
};
