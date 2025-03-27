<template>
    <h3>条件渲染</h3>

    <!-- v-if指令(一开始费用低，之后转换时费用高) -->

    <div v-if="flag">你能看见我吗</div>

    <!-- v-else指令 -->

    <div v-else>那你还是看看我吧</div>

    <!-- v-else-if指令 -->

    <div v-if="type === 'A'">A</div>
    <div v-else-if="type === 'B'">B</div>
    <div v-else-if="type === 'C'">C</div>
    <div v-else>Not A/B/C</div>

    <!-- v-show指令(一开始费用高，之后转换时费用低) -->

    <div v-show="flag">你是不是能看见我</div>

</template>
<script>

export default {
    data() {
        return {
            flag: true,
            type: "D",
        }
    }
}

</script>