<template>
  <v-container fluid>
    <v-card>
      <v-card-text>
        <h1>LOGIN</h1>
      </v-card-text>
      <v-card-text>
        <v-form>
          <v-text-field
            label="ID"
            name="ID"
            prepend-icon="mdi-account"
            type="text"
            v-model="id"
          ></v-text-field>

          <v-text-field
            id="password"
            label="Password"
            name="password"
            prepend-icon="mdi-lock"
            type="password"
            v-model="pw"
          ></v-text-field>
        </v-form>
      </v-card-text>
      <v-card-actions>
        <v-spacer></v-spacer>
        <v-btn color="primary" @click="signin">Login</v-btn>
      </v-card-actions>
    </v-card>
  </v-container>
</template>

<script>
import http from '../plugins/http-common';
export default {
  data() {
    return {
      id: '',
      pw: '',
    };
  },
  methods: {
    signin() {
      http
        .post('login', { id: this.id, pw: this.pw })
        .then(response => {
          this.$store.dispatch('SIGNIN', response.data);
          alert('Welcome!');
          this.$router.push('/chatroom');
        })
        .catch(response => {
          console.log(response.msg);
          //   alert('login failed...' + this.id + '   ' + this.pw);
          alert('login failed...' + this.id + '   ' + this.pw);
        });
    },
  },
};
</script>
