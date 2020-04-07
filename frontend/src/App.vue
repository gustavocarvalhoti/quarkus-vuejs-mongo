<template>
  <div id="app">
    <Nav />
    <transition>
      <router-view />
    </transition>
  </div>
</template>
<script>
import Nav from "./components/nav/Nav";
export default {
  components: {
    Nav
  }
};
</script>>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  margin-top: 50px;
  margin-bottom: 50px;
}
</style>
