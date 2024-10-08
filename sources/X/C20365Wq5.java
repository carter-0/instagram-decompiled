package X;

/* renamed from: X.Wq5  reason: case insensitive filesystem */
public final class C20365Wq5 implements Runnable {
    public Object A00;
    public final /* synthetic */ 1Ln A01;

    public static Double A00(Object[] objArr, int i) {
        Number number = objArr[i];
        if (number != null) {
            return Double.valueOf((double) number.floatValue());
        }
        return null;
    }

    public static Long A01(Object[] objArr, int i) {
        Number number = objArr[i];
        if (number != null) {
            return Long.valueOf((long) number.intValue());
        }
        return null;
    }

    public static String A02(int i, Object[] objArr) {
        Object obj = objArr[i];
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public C20365Wq5(1Ln r1) {
        this.A01 = r1;
    }

    public final void run() {
        Long l;
        Object[] objArr = (Object[]) this.A00;
        1Ln r3 = this.A01;
        if (DbT.A1Y(r3) && objArr != null) {
            r3.A0Q("key_ram_total_kb", (Long) objArr[0]);
            Number number = (Number) objArr[1];
            Long l2 = null;
            if (number != null) {
                l = C51969G9p.A0r(number);
            } else {
                l = null;
            }
            r3.A0Q("key_cpu_num_cores", l);
            r3.A0Q("key_cpu_max_frequency_mhz", A01(objArr, 2));
            r3.A0R("key_display_size_pixels", A02(3, objArr));
            r3.A0P("key_display_max_refresh_rate_fps", A00(objArr, 4));
            r3.A0O("key_display_hdr_supported", (Boolean) objArr[5]);
            r3.A0O("key_display_wide_colour_gamut_supported", (Boolean) objArr[6]);
            r3.A0O("key_camera_back_facing_present", (Boolean) objArr[7]);
            r3.A0O("key_camera_front_facing_present", (Boolean) objArr[8]);
            r3.A0O("key_camera_autofocus_supported", (Boolean) objArr[9]);
            r3.A0O("key_camera_motion_tracking_supported", (Boolean) objArr[10]);
            r3.A0O("key_camera_flash_supported", (Boolean) objArr[11]);
            r3.A0O("key_camera_is_full_hardware_level", (Boolean) objArr[12]);
            r3.A0O("key_camera_concurrent_capture_supported", (Boolean) objArr[13]);
            r3.A0O("key_camera_manual_post_processing_supported", (Boolean) objArr[14]);
            r3.A0O("key_camera_manual_sensor_supported", (Boolean) objArr[15]);
            r3.A0O("key_camera_raw_image_capture_supported", (Boolean) objArr[16]);
            r3.A0O("key_audio_is_low_latency", (Boolean) objArr[17]);
            r3.A0O("key_audio_is_pro_level", (Boolean) objArr[18]);
            r3.A0O("key_audio_midi_api_supported", (Boolean) objArr[19]);
            r3.A0O("key_audio_microphone_present", (Boolean) objArr[20]);
            r3.A0R("key_opengles_deqp_test_date", A02(21, objArr));
            r3.A0O("key_opengles_android_extension_pack_supported", (Boolean) objArr[22]);
            r3.A0R("key_vulkan_deqp_test_date", A02(23, objArr));
            r3.A0O("key_vulkan_hardware_compute_supported", (Boolean) objArr[24]);
            r3.A0Q("key_vulkan_hardware_level", A01(objArr, 25));
            r3.A0R("key_vulkan_hardware_version", A02(26, objArr));
            r3.A0R("key_opengles_renderer", A02(27, objArr));
            r3.A0R("key_opengles_vendor", A02(28, objArr));
            r3.A0R("key_opengles_version", A02(29, objArr));
            r3.A0Q("key_opengles_max_texture_size_pixels", A01(objArr, 30));
            r3.A0Q("key_opengles_max_image_texture_units", A01(objArr, 31));
            r3.A0Q("key_opengles_max_vertex_texture_image_units", A01(objArr, 32));
            r3.A0Q("key_opengles_max_combined_texture_image_units", A01(objArr, 33));
            r3.A0Q("key_opengles_max_geometry_texture_image_units", A01(objArr, 34));
            r3.A0Q("key_opengles_max_cube_map_texture_size", A01(objArr, 35));
            r3.A0Q("key_opengles_max_renderbuffer_size", A01(objArr, 36));
            r3.A0Q("key_opengles_max_viewport_width", A01(objArr, 37));
            r3.A0Q("key_opengles_max_viewport_height", A01(objArr, 38));
            r3.A0O("key_video_avc_software_decoder_supported", (Boolean) objArr[39]);
            r3.A0Q("key_video_avc_software_decoder_max_instances", A01(objArr, 40));
            r3.A0O("key_video_avc_hardware_decoder_supported", (Boolean) objArr[41]);
            r3.A0Q("key_video_avc_hardware_decoder_max_instances", A01(objArr, 42));
            r3.A0O("key_video_avc_software_encoder_supported", (Boolean) objArr[43]);
            r3.A0Q("key_video_avc_software_encoder_max_instances", A01(objArr, 44));
            r3.A0O("key_video_avc_hardware_encoder_supported", (Boolean) objArr[45]);
            r3.A0Q("key_video_avc_hardware_encoder_max_instances", A01(objArr, 46));
            r3.A0O("key_video_hevc_software_decoder_supported", (Boolean) objArr[47]);
            r3.A0Q("key_video_hevc_software_decoder_max_instances", A01(objArr, 48));
            r3.A0O("key_video_hevc_hardware_decoder_supported", (Boolean) objArr[49]);
            r3.A0Q("key_video_hevc_hardware_decoder_max_instances", A01(objArr, 50));
            r3.A0O("key_video_hevc_software_encoder_supported", (Boolean) objArr[51]);
            r3.A0Q("key_video_hevc_software_encoder_max_instances", A01(objArr, 52));
            r3.A0O("key_video_hevc_hardware_encoder_supported", (Boolean) objArr[53]);
            r3.A0Q("key_video_hevc_hardware_encoder_max_instances", A01(objArr, 54));
            r3.A0O("key_video_av1_software_decoder_supported", (Boolean) objArr[55]);
            r3.A0Q("key_video_av1_software_decoder_max_instances", A01(objArr, 56));
            r3.A0O("key_video_av1_hardware_decoder_supported", (Boolean) objArr[57]);
            r3.A0Q("key_video_av1_hardware_decoder_max_instances", A01(objArr, 58));
            r3.A0O("key_video_av1_software_encoder_supported", (Boolean) objArr[59]);
            r3.A0Q("key_video_av1_software_encoder_max_instances", A01(objArr, 60));
            r3.A0O("key_video_av1_hardware_encoder_supported", (Boolean) objArr[61]);
            r3.A0Q("key_video_av1_hardware_encoder_max_instances", A01(objArr, 62));
            r3.A0O("key_video_vp9_software_decoder_supported", (Boolean) objArr[63]);
            r3.A0Q("key_video_vp9_software_decoder_max_instances", A01(objArr, 64));
            r3.A0O("key_video_vp9_hardware_decoder_supported", (Boolean) objArr[65]);
            r3.A0Q("key_video_vp9_hardware_decoder_max_instances", A01(objArr, 66));
            r3.A0O("key_video_vp9_software_encoder_supported", (Boolean) objArr[67]);
            r3.A0Q("key_video_vp9_software_encoder_max_instances", A01(objArr, 68));
            r3.A0O("key_video_vp9_hardware_encoder_supported", (Boolean) objArr[69]);
            r3.A0Q("key_video_vp9_hardware_encoder_max_instances", A01(objArr, 70));
            r3.A0O("key_video_decoder_hdr_supported", (Boolean) objArr[71]);
            r3.A0O("key_video_encoder_hdr_supported", (Boolean) objArr[72]);
            r3.A0R("key_camera_back_sensor_pixel_resolution", A02(73, objArr));
            r3.A0R("key_camera_front_sensor_pixel_resolution", A02(74, objArr));
            r3.A0R("key_camera_back_sensor_physical_size_mm", A02(75, objArr));
            r3.A0R("key_camera_front_sensor_physical_size_mm", A02(76, objArr));
            r3.A0R("key_camera_front_jpeg_photo_max_pixel_resolution", A02(77, objArr));
            r3.A0R("key_camera_back_jpeg_photo_max_pixel_resolution", A02(78, objArr));
            r3.A0R("key_camera_front_raw_photo_max_pixel_resolution", A02(79, objArr));
            r3.A0R("key_camera_back_raw_photo_max_pixel_resolution", A02(80, objArr));
            r3.A0R("key_camera_front_raw10_photo_max_pixel_resolution", A02(81, objArr));
            r3.A0R("key_camera_back_raw10_photo_max_pixel_resolution", A02(82, objArr));
            r3.A0R("key_camera_front_raw12_photo_max_pixel_resolution", A02(83, objArr));
            r3.A0R("key_camera_back_raw12_photo_max_pixel_resolution", A02(84, objArr));
            r3.A0R("key_camera_front_heic_photo_max_pixel_resolution", A02(85, objArr));
            r3.A0R("key_camera_back_heic_photo_max_pixel_resolution", A02(86, objArr));
            r3.A0R("key_camera_front_ultra_hdr_photo_max_pixel_resolution", A02(87, objArr));
            r3.A0R("key_camera_back_ultra_hdr_photo_max_pixel_resolution", A02(88, objArr));
            r3.A0R("key_camera_front_preview_stream_max_pixel_resolution", A02(89, objArr));
            r3.A0R("key_camera_back_preview_stream_max_pixel_resolution", A02(90, objArr));
            r3.A0R("key_camera_front_video_stream_max_pixel_resolution", A02(91, objArr));
            r3.A0R("key_camera_back_video_stream_max_pixel_resolution", A02(92, objArr));
            r3.A0R("key_camera_front_cpu_stream_max_pixel_resolution", A02(93, objArr));
            r3.A0R("key_camera_back_cpu_stream_max_pixel_resolution", A02(94, objArr));
            r3.A0O("key_camera_front_hlg_hdr_video_supported", (Boolean) objArr[95]);
            r3.A0O("key_camera_back_hlg_hdr_video_supported", (Boolean) objArr[96]);
            r3.A0O("key_camera_front_burst_capture_supported", (Boolean) objArr[97]);
            r3.A0O("key_camera_back_burst_capture_supported", (Boolean) objArr[98]);
            r3.A0O("key_camera_front_ultra_high_resolution_sensor_supported", (Boolean) objArr[99]);
            r3.A0O("key_camera_back_ultra_high_resolution_sensor_supported", (Boolean) objArr[100]);
            r3.A0O("key_camera_front_logical_multi_camera_supported", (Boolean) objArr[101]);
            r3.A0O("key_camera_back_logical_multi_camera_supported", (Boolean) objArr[102]);
            r3.A0O("key_camera_front_zsl_private_reprocessing_supported", (Boolean) objArr[103]);
            r3.A0O("key_camera_back_zsl_private_reprocessing_supported", (Boolean) objArr[104]);
            r3.A0O("key_camera_front_zsl_yuv_reprocessing_supported", (Boolean) objArr[105]);
            r3.A0O("key_camera_back_zsl_yuv_reprocessing_supported", (Boolean) objArr[106]);
            r3.A0O("key_camera_front_remosaic_reprocessing_supported", (Boolean) objArr[107]);
            r3.A0O("key_camera_back_remosaic_reprocessing_supported", (Boolean) objArr[108]);
            r3.A0O("key_camera_front_depth_output_supported", (Boolean) objArr[109]);
            r3.A0O("key_camera_back_depth_output_supported", (Boolean) objArr[110]);
            r3.A0O("key_camera_front_read_sensor_settings_supported", (Boolean) objArr[111]);
            r3.A0O("key_camera_back_read_sensor_settings_supported", (Boolean) objArr[112]);
            r3.A0O("key_camera_front_secure_image_data_supported", (Boolean) objArr[113]);
            r3.A0O("key_camera_back_secure_image_data_supported", (Boolean) objArr[114]);
            r3.A0O("key_camera_front_stream_use_case_supported", (Boolean) objArr[115]);
            r3.A0O("key_camera_back_stream_use_case_supported", (Boolean) objArr[116]);
            r3.A0O("key_camera_front_constrained_high_speed_video_supported", (Boolean) objArr[117]);
            r3.A0O("key_camera_back_constrained_high_speed_video_supported", (Boolean) objArr[118]);
            r3.A0R("key_camera_front_constrained_high_speed_video_max_pixel_resolution", A02(119, objArr));
            r3.A0R("key_camera_back_constrained_high_speed_video_max_pixel_resolution", A02(120, objArr));
            r3.A0P("key_camera_front_constrained_high_speed_video_max_fps", A00(objArr, 121));
            r3.A0P("key_camera_back_constrained_high_speed_video_max_fps", A00(objArr, 122));
            r3.A0Q("key_camera_front_constrained_high_speed_video_max_throughput_pps", (Long) objArr[123]);
            r3.A0Q("key_camera_back_constrained_high_speed_video_max_throughput_pps", (Long) objArr[124]);
            r3.A0P("key_camera_front_max_fps", A00(objArr, 125));
            r3.A0P("key_camera_back_max_fps", A00(objArr, 126));
            r3.A0Q("key_camera_front_max_throughput_pps", (Long) objArr[127]);
            r3.A0Q("key_camera_back_max_throughput_pps", (Long) objArr[128]);
            r3.A0O("key_camera_front_preview_stabilization_supported", (Boolean) objArr[129]);
            r3.A0O("key_camera_back_preview_stabilization_supported", (Boolean) objArr[130]);
            r3.A0O("key_camera_front_optical_stabilization_supported", (Boolean) objArr[131]);
            r3.A0O("key_camera_back_optical_stabilization_supported", (Boolean) objArr[132]);
            r3.A0O("key_camera_front_realtime_timestamp_supported", (Boolean) objArr[133]);
            r3.A0O("key_camera_back_realtime_timestamp_supported", (Boolean) objArr[134]);
            r3.A0O("key_camera_front_high_quality_noise_reduction_supported", (Boolean) objArr[135]);
            r3.A0O("key_camera_back_high_quality_noise_reduction_supported", (Boolean) objArr[136]);
            r3.A0O("key_camera_front_zsl_noise_reduction_supported", (Boolean) objArr[137]);
            r3.A0O("key_camera_back_zsl_noise_reduction_supported", (Boolean) objArr[138]);
            r3.A0O("key_camera_front_minimal_noise_reduction_supported", (Boolean) objArr[139]);
            r3.A0O("key_camera_back_minimal_noise_reduction_supported", (Boolean) objArr[140]);
            r3.A0O("key_camera_front_fast_noise_reduction_supported", (Boolean) objArr[141]);
            r3.A0O("key_camera_back_fast_noise_reduction_supported", (Boolean) objArr[142]);
            r3.A0O("key_camera_front_high_quality_tonemap_mode_supported", (Boolean) objArr[143]);
            r3.A0O("key_camera_back_high_quality_tonemap_mode_supported", (Boolean) objArr[144]);
            r3.A0O("key_camera_front_fast_tonemap_mode_supported", (Boolean) objArr[145]);
            r3.A0O("key_camera_back_fast_tonemap_mode_supported", (Boolean) objArr[146]);
            r3.A0O("key_camera_front_contrast_curve_tonemap_mode_supported", (Boolean) objArr[147]);
            r3.A0O("key_camera_back_contrast_curve_tonemap_mode_supported", (Boolean) objArr[148]);
            r3.A0O("key_camera_front_gamma_value_tonemap_mode_supported", (Boolean) objArr[149]);
            r3.A0O("key_camera_back_gamma_value_tonemap_mode_supported", (Boolean) objArr[150]);
            r3.A0O("key_camera_front_preset_curve_tonemap_mode_supported", (Boolean) objArr[151]);
            r3.A0O("key_camera_back_preset_curve_tonemap_mode_supported", (Boolean) objArr[152]);
            r3.A0O("key_camera_front_face_detection_mode_simple_supported", (Boolean) objArr[153]);
            r3.A0O("key_camera_back_face_detection_mode_simple_supported", (Boolean) objArr[154]);
            r3.A0O("key_camera_front_face_detection_mode_full_supported", (Boolean) objArr[155]);
            r3.A0O("key_camera_back_face_detection_mode_full_supported", (Boolean) objArr[156]);
            r3.A0Q("key_camera_front_face_detection_max_face_count", A01(objArr, 157));
            r3.A0Q("key_camera_back_face_detection_max_face_count", A01(objArr, 158));
            r3.A0O("key_camera_front_zoom_supported", (Boolean) objArr[159]);
            r3.A0O("key_camera_back_zoom_supported", (Boolean) objArr[160]);
            r3.A0O("key_camera_front_smooth_zoom_support", (Boolean) objArr[161]);
            r3.A0O("key_camera_back_smooth_zoom_support", (Boolean) objArr[162]);
            r3.A0P("key_camera_front_zoom_min_ratio", A00(objArr, 163));
            r3.A0P("key_camera_back_zoom_min_ratio", A00(objArr, 164));
            r3.A0P("key_camera_front_zoom_max_ratio", A00(objArr, 165));
            r3.A0P("key_camera_back_zoom_max_ratio", A00(objArr, 166));
            r3.A0O("key_camera_front_iso_sensitivity_control_supported", (Boolean) objArr[167]);
            r3.A0O("key_camera_back_iso_sensitivity_control_supported", (Boolean) objArr[168]);
            r3.A0Q("key_camera_front_min_iso_sensitivity", A01(objArr, 169));
            r3.A0Q("key_camera_back_min_iso_sensitivity", A01(objArr, C11152SCh.MAX_FACTORIAL));
            r3.A0Q("key_camera_front_max_iso_sensitivity", A01(objArr, 171));
            r3.A0Q("key_camera_back_max_iso_sensitivity", A01(objArr, 172));
            r3.A0O("key_camera_front_exposure_control_supported", (Boolean) objArr[173]);
            r3.A0O("key_camera_back_exposure_control_supported", (Boolean) objArr[174]);
            r3.A0Q("key_camera_front_min_exposure_time_nanoseconds", (Long) objArr[175]);
            r3.A0Q("key_camera_back_min_exposure_time_nanoseconds", (Long) objArr[176]);
            r3.A0Q("key_camera_front_max_exposure_time_nanoseconds", (Long) objArr[177]);
            r3.A0Q("key_camera_back_max_exposure_time_nanoseconds", (Long) objArr[178]);
            r3.A0O("key_camera_front_focus_mode_off_supported", (Boolean) objArr[179]);
            r3.A0O("key_camera_back_focus_mode_off_supported", (Boolean) objArr[180]);
            r3.A0O("key_camera_front_focus_mode_auto_supported", (Boolean) objArr[181]);
            r3.A0O("key_camera_back_focus_mode_auto_supported", (Boolean) objArr[182]);
            r3.A0O("key_camera_front_focus_mode_macro_supported", (Boolean) objArr[183]);
            r3.A0O("key_camera_back_focus_mode_macro_supported", (Boolean) objArr[184]);
            r3.A0O("key_camera_front_focus_mode_edof_supported", (Boolean) objArr[185]);
            r3.A0O("key_camera_back_focus_mode_edof_supported", (Boolean) objArr[186]);
            r3.A0O("key_camera_front_focus_mode_continuous_picture_supported", (Boolean) objArr[187]);
            r3.A0O("key_camera_back_focus_mode_continuous_picture_supported", (Boolean) objArr[188]);
            r3.A0O("key_camera_front_focus_mode_continuous_video_supported", (Boolean) objArr[189]);
            r3.A0O("key_camera_back_focus_mode_continuous_video_supported", (Boolean) objArr[190]);
            r3.A0O("key_camera_front_auto_exposure_lock_supported", (Boolean) objArr[191]);
            r3.A0O("key_camera_back_auto_exposure_lock_supported", (Boolean) objArr[192]);
            r3.A0O("key_camera_front_auto_white_balance_lock_supported", (Boolean) objArr[193]);
            r3.A0O("key_camera_back_auto_white_balance_lock_supported", (Boolean) objArr[194]);
            r3.A0O("key_camera_front_variable_aperture_supported", (Boolean) objArr[195]);
            r3.A0O("key_camera_back_variable_aperture_supported", (Boolean) objArr[196]);
            r3.A0P("key_camera_front_min_aperture_f", A00(objArr, 197));
            r3.A0P("key_camera_back_min_aperture_f", A00(objArr, 198));
            r3.A0P("key_camera_front_max_aperture_f", A00(objArr, 199));
            r3.A0P("key_camera_back_max_aperture_f", A00(objArr, 200));
            r3.A0Q("key_camera_front_max_num_focus_areas", A01(objArr, 201));
            r3.A0Q("key_camera_back_max_num_focus_areas", A01(objArr, 202));
            r3.A0Q("key_camera_front_max_num_exposure_metering_areas", A01(objArr, 203));
            r3.A0Q("key_camera_back_max_num_exposure_metering_areas", A01(objArr, 204));
            r3.A0Q("key_camera_front_max_num_white_balance_metering_areas", A01(objArr, 205));
            Number number2 = (Number) objArr[206];
            if (number2 != null) {
                l2 = C51969G9p.A0r(number2);
            }
            r3.A0Q("key_camera_back_max_num_white_balance_metering_areas", l2);
            r3.A0O("key_camera_front_video_snapshot_supported", (Boolean) objArr[207]);
            r3.A0O("key_camera_back_video_snapshot_supported", (Boolean) objArr[208]);
            r3.Cgf();
            0xY AR4 = DbV.A0d().AR4();
            AR4.E5T("preference_has_logged_static_attributes", true);
            AR4.apply();
        }
    }

    public C20365Wq5() {
    }
}
