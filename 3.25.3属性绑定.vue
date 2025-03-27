<template>
  <!-- v-bind指令 -->
   <!-- 可以直接简写: -->
  <div v-bind:class="msg" :id="eid">测试</div>
  <button :disabled="buttondisable">Button</button>
  <div v-bind="objectAll">测试2</div>

</template>

<script>

export default {
  data() {
    return {
      msg:"active",
      eid:"hhh",
      buttondisable:false,
      objectAll:{
        class:"appclass",
        id:"appid",
      }
    }
  }
}

</script>

<style>

.active{
  color: rgba(0,0,0,0.6);
  font-size: 25px;
}

</style>