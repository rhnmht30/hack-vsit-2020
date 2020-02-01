const express = require("express");
const router = express.Router();

const { test, location } = require("../../../controllers/index_controller");
const { catchErrors } = require("../../../config/errorHandler");

router.get("/", catchErrors(test));
router.get("/location", catchErrors(location));

module.exports = router;
