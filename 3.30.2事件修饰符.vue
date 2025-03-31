<template>
    <h3>事件修饰符</h3>
    <!-- 阻止事件默认 -->
    <a @click.prevent="clickHandle" href="https://www.qidian.com/">起点</a>

    <!-- 阻止事件冒泡 -->
    <div @click="clickDiv">
        <p @click.stop="clickP">测试冒泡</p>
    </div>
</template>
<script>

export default {
    data() {
        return {

        }
    },
    methods: {
        clickHandle(e) {
            // e.preventDefault();
            console.log("点击了");

        },
        clickDiv() {
            console.log("div");

        },
        clickP(e) {
            // e.stopPropagation();
            console.log("P");

        }
    }
}

</script>