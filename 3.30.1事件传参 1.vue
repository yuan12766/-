<template>
    <h3>传递参数</h3>
    <button @click="addCount">Add</button>
    <p>{{ count }}</p>
</template>

<script>

const { log } = console;

export default {
    data() {
        return {
            count: 0,
        }
    },
    methods: {
        addCount(e) {
            // e.target.innerHTML = "Add " + this.count
            this.count++
        }
    }
}

</script>