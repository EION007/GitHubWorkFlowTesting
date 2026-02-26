const axios = require("axios");

const URL = "https://githubworkflowtesting-production.up.railway.app/api/products";

async function testEndpoint() {
  try {
    console.log("🚀 Testing endpoint:", URL);

    const response = await axios.get(URL);

    console.log("Status Code:", response.status);

    if (response.status !== 200) {
      throw new Error("Invalid status code");
    }

    if (!Array.isArray(response.data)) {
      throw new Error("Response is not an array");
    }

    console.log("Products count:", response.data.length);
    console.log("✅ API Test Passed");

  } catch (error) {
    console.error("❌ API Test Failed:", error.message);
    process.exit(1);
  }
}

testEndpoint();