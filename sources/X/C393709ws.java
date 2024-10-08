package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9ws  reason: invalid class name and case insensitive filesystem */
public abstract class C393709ws {
    public static C372098zg parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C372098zg r0 = new C372098zg();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("face_models".equals(A17)) {
                    r0.A01 = AAN.parseFromJson(r5);
                } else if ("new_face_models".equals(A17)) {
                    r0.A02 = AAN.parseFromJson(r5);
                } else if ("new_segmentation_model".equals(A17)) {
                    r0.A04 = AAN.parseFromJson(r5);
                } else if ("new_hair_segmentation_model".equals(A17)) {
                    r0.A03 = AAN.parseFromJson(r5);
                } else if ("new_target_recognition_model".equals(A17)) {
                    r0.A05 = AAN.parseFromJson(r5);
                } else {
                    ArrayList arrayList = null;
                    if ("effects".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                CameraAREffect parseFromJson = AnonymousClass515.parseFromJson(r5);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r0.A07 = arrayList;
                    } else if ("pre_capture_effects_order".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r5, arrayList);
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r0.A0A = arrayList;
                    } else if ("post_capture_effects_order".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r5, arrayList);
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r0.A09 = arrayList;
                    } else if ("live_effects_order".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r5, arrayList);
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r0.A08 = arrayList;
                    } else if ("video_call_effects_order".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r5, arrayList);
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r0.A0D = arrayList;
                    } else if ("reels_effects_order".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                AnonymousClass7TG.A1F(r5, arrayList);
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r0.A0B = arrayList;
                    } else if ("saved_effects_list".equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r5.A1J() != 16L.A08) {
                                CameraAREffect parseFromJson2 = AnonymousClass515.parseFromJson(r5);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        r0.A0C = arrayList;
                    } else if ("last_face_effects_fetch_time_ms".equals(A17)) {
                        r0.A00 = r5.A0y();
                    } else if ("last_world_tracker_fetch_time_ms".equals(A17)) {
                        r5.A0y();
                    } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                        r0.A06 = AnonymousClass7TG.A0l(r5);
                    }
                }
                r5.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
