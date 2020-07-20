<template>
  <v-list>
    <div>
      <v-list-item v-for ref=""> </v-list-item>
    </div>
  </v-list>
</template>

<script>
import http from '../plugins/http-common';
import { mapGetters } from 'vuex';
export default {
  data() {
    return {
      clist: [],
      csend: '',
    };
  },
  mounted() {},
  computed: {
    ...mapGetters(['name', 'userData']),
  },
  methods: {
    getList() {
      http
        .get('chat')
        .then(response => {
          this.clist = response.list;
        })
        .catch(response => {
          console.log(response.msg);
        });
    },
    sendChat() {
      http
        .post('chat', { num: this.userData.num, content: this.csend })
        .catch();
    },
  },
};
</script>
