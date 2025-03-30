<template>
    <h3>传递参数</h3>
    <p @click="getNameHandle(item, $event)" v-for="(item, index) of names" :key="index">{{ item }}</p>
</template>

<script>

const { log } = console;

export default {
    data() {
        return {
            names: ["qwe", "asd", "zxc"],
        }
    },
    methods: {
        getNameHandle(name, e) {
            console.log(name);
            console.log(e);
        }
    }
}

</script>