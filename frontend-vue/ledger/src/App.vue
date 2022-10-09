<template>
  <form v-on:submit.prevent="submitForm">
    <div>
      <br><br><br><br>
      <label for="sendAmount" v-html="moneyEmojis"></label><br>
      <input id="sendAmount" type="text" v-model="sendAmount"/><br>
      <button type="submit">send</button>
      <h1>today's total: {{ todayTotal }}</h1>
    </div>
  </form>
</template>

<script>
export default {
  data: function() {
    return {
      moneyEmojis: "&#128184;&#128176;&#128179;",
      sendAmount: 0,
      todayTotal: 0,
    }
  },
  methods: {
    submitForm: function() {
      var amountToInt = parseInt(this.sendAmount);

      //TODO axios post today's amount, then get the caluclated amount
      // var addAmountData = {
      //   amount: this.sendAmount;
      // }

      this.todayTotal += amountToInt;
      this.sendAmount = 0;
    }
  }
}
</script>

<style>
div {
  display: grid;
  justify-content: center;
}
label {
  font-size: 30px;
}
label,input {
  display: flex;
  flex-direction:column;
}
input {
  border-radius: 25px;
  border: 2px solid gray;
  font-size: 40px;
  text-align: center;
  padding: 20px; 
  width: 100px;
  height: 100px;  
}
button {
  border-radius: 15px;
  border: 2px solid #gray;
  padding: 20px; 
  width: 100px;
  height: 40px;  
}
/* #app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
} */
</style>
