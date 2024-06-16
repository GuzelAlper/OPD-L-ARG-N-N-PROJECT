package com.example.myfitnessapp.data

import com.example.myfitnessapp.model.DayTip
import com.example.myfitnessapp.R

class Datasource() {
    fun loadDayTips(): List<DayTip> {
        return listOf(
            DayTip(1, R.string.day_tip_summary_1, R.string.day_tip_detail_1, R.drawable.squats),
            DayTip(2, R.string.day_tip_summary_2, R.string.day_tip_detail_2, R.drawable.push_ups),
            DayTip(3, R.string.day_tip_summary_3, R.string.day_tip_detail_3, R.drawable.lunges),
            DayTip(4, R.string.day_tip_summary_4, R.string.day_tip_detail_4, R.drawable.plank),
            DayTip(5, R.string.day_tip_summary_5, R.string.day_tip_detail_5, R.drawable.jumping_jacks),
            DayTip(6, R.string.day_tip_summary_6, R.string.day_tip_detail_6, R.drawable.burpees),
            DayTip(7, R.string.day_tip_summary_7, R.string.day_tip_detail_7, R.drawable.sit_ups),
            DayTip(8, R.string.day_tip_summary_8, R.string.day_tip_detail_8, R.drawable.mountain_climbers),
            DayTip(9, R.string.day_tip_summary_9, R.string.day_tip_detail_9, R.drawable.leg_raises),
            DayTip(10, R.string.day_tip_summary_10, R.string.day_tip_detail_10, R.drawable.high_knees),
            DayTip(11, R.string.day_tip_summary_11, R.string.day_tip_detail_11, R.drawable.russian_twists),
            DayTip(12, R.string.day_tip_summary_12, R.string.day_tip_detail_12, R.drawable.tricep_dips),
            DayTip(13, R.string.day_tip_summary_13, R.string.day_tip_detail_13, R.drawable.side_planks),
            DayTip(14, R.string.day_tip_summary_14, R.string.day_tip_detail_14, R.drawable.arm_circles),
            DayTip(15, R.string.day_tip_summary_15, R.string.day_tip_detail_15, R.drawable.flutter_kicks),
            DayTip(16, R.string.day_tip_summary_16, R.string.day_tip_detail_16, R.drawable.box_jumps),
            DayTip(17, R.string.day_tip_summary_17, R.string.day_tip_detail_17, R.drawable.bicycle_crunches),
            DayTip(18, R.string.day_tip_summary_18, R.string.day_tip_detail_18, R.drawable.step_ups),
            DayTip(19, R.string.day_tip_summary_19, R.string.day_tip_detail_19, R.drawable.squat_jumps),
            DayTip(20, R.string.day_tip_summary_20, R.string.day_tip_detail_20, R.drawable.calf_raises),
            DayTip(21, R.string.day_tip_summary_21, R.string.day_tip_detail_21, R.drawable.glute_bridges),
            DayTip(22, R.string.day_tip_summary_22, R.string.day_tip_detail_22, R.drawable.supermans),
            DayTip(23, R.string.day_tip_summary_23, R.string.day_tip_detail_23, R.drawable.wall_sit),
            DayTip(24, R.string.day_tip_summary_24, R.string.day_tip_detail_24, R.drawable.crunches),
            DayTip(25, R.string.day_tip_summary_25, R.string.day_tip_detail_25, R.drawable.back_extensions),
            DayTip(26, R.string.day_tip_summary_26, R.string.day_tip_detail_26, R.drawable.pull_ups),
            DayTip(27, R.string.day_tip_summary_27, R.string.day_tip_detail_27, R.drawable.chin_ups),
            DayTip(28, R.string.day_tip_summary_28, R.string.day_tip_detail_28, R.drawable.skater_jumps),
            DayTip(29, R.string.day_tip_summary_29, R.string.day_tip_detail_29, R.drawable.tuck_jumps),
            DayTip(30, R.string.day_tip_summary_30, R.string.day_tip_detail_30, R.drawable.stretch)
        )
    }
}