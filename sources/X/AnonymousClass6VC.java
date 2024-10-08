package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6VC  reason: invalid class name */
public final class AnonymousClass6VC {
    public static volatile AnonymousClass6VC A02;
    public final 1QP A00;
    public final UserSession A01;

    public final void A06(C255773uh r6) {
        0qQ.A0B(r6, 0);
        String str = r6.A0k;
        0qQ.A07(str);
        Long A012 = A01(this, str, A02(r6));
        if (A012 != null) {
            long longValue = A012.longValue();
            1QP r1 = this.A00;
            r1.flowMarkPoint(longValue, "json_fetch_fail");
            r1.flowAnnotate(longValue, TraceFieldType.FailureReason, "json_fetch_fail");
        }
        A0A(r6, AnonymousClass05K.A00);
    }

    public final void A07(C255773uh r5) {
        0qQ.A0B(r5, 0);
        String str = r5.A0k;
        0qQ.A07(str);
        Long A012 = A01(this, str, A02(r5));
        if (A012 != null) {
            this.A00.flowMarkPoint(A012.longValue(), "json_fetch_success");
        }
    }

    public final void A09(C255773uh r5, Integer num) {
        String str;
        0qQ.A0B(r5, 0);
        String str2 = r5.A0k;
        0qQ.A07(str2);
        Long A012 = A01(this, str2, A02(r5));
        if (A012 != null) {
            long longValue = A012.longValue();
            1QP r1 = this.A00;
            switch (num.intValue()) {
                case 0:
                    str = "dismiss_swipe";
                    break;
                case 1:
                    str = "dismiss_tap_back";
                    break;
                case 2:
                    str = "navigate_before_load";
                    break;
                default:
                    str = "navigate_to_another_view_before_load";
                    break;
            }
            r1.flowEndCancel(longValue, str);
        }
    }

    public final void A0A(C255773uh r6, Integer num) {
        String str;
        0qQ.A0B(r6, 0);
        String str2 = r6.A0k;
        0qQ.A07(str2);
        Long A012 = A01(this, str2, A02(r6));
        if (A012 != null) {
            long longValue = A012.longValue();
            1QP r4 = this.A00;
            switch (num.intValue()) {
                case 0:
                    str = "json_fetch_fail";
                    break;
                case 1:
                    str = "photo_fetch_fail";
                    break;
                case 2:
                    str = "video_fetch_fail";
                    break;
                default:
                    str = "video_playback_fail";
                    break;
            }
            r4.flowEndFail(longValue, str, (String) null);
        }
    }

    public final void A0B(C255773uh r6, boolean z) {
        Integer num;
        String str;
        0qQ.A0B(r6, 0);
        String str2 = r6.A0k;
        0qQ.A07(str2);
        Long A012 = A01(this, str2, A02(r6));
        if (A012 != null) {
            long longValue = A012.longValue();
            1QP r4 = this.A00;
            if (z) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            if (num.intValue() != 0) {
                str = "network";
            } else {
                str = "cache";
            }
            r4.flowAnnotate(longValue, "media_fetch_mode", str);
        }
    }

    public final void A0F(C250973mM r5, String str) {
        0qQ.A0B(r5, 0);
        if (str != null) {
            C255773uh A08 = r5.A08(this.A01);
            String str2 = A08.A0k;
            0qQ.A07(str2);
            Long A012 = A01(this, str2, A02(A08));
            if (A012 != null) {
                this.A00.flowAnnotate(A012.longValue(), AnonymousClass000.A00(5155), str);
            }
        }
    }

    public static final long A00(AnonymousClass6VC r2, String str, String str2) {
        1QP r22 = r2.A00;
        if (str2 == null) {
            str2 = "";
        }
        return r22.generateFlowId(17313040, 002.A0R(str, str2).hashCode());
    }

    public static final void A05(C250973mM r8, AnonymousClass3BQ r9, AnonymousClass6VC r10, Integer num, boolean z) {
        String str;
        Reel reel = r8.A0H;
        UserSession userSession = r10.A01;
        C255773uh A08 = r8.A08(userSession);
        String id = reel.getId();
        0qQ.A07(id);
        long A002 = A00(r10, id, A02(A08));
        if (z || !r10.A00.isOngoingFlow(A002)) {
            1QP r7 = r10.A00;
            switch (num.intValue()) {
                case 0:
                    str = AnonymousClass000.A00(3348);
                    break;
                case 1:
                    str = "story";
                    break;
                default:
                    str = "segment";
                    break;
            }
            r7.flowStart(A002, new UserFlowConfig(str, true));
            r7.flowAnnotate(A002, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r9.A00);
            A03(reel, r8.A08(userSession), r10);
            A04(reel, r8.A08(userSession), r10);
        }
    }

    public final void A08(C255773uh r6) {
        Integer num;
        String str = r6.A0k;
        0qQ.A07(str);
        Long A012 = A01(this, str, A02(r6));
        if (A012 != null) {
            long longValue = A012.longValue();
            1QP r1 = this.A00;
            r1.flowMarkPoint(longValue, "media_fetch_fail");
            r1.flowAnnotate(longValue, TraceFieldType.FailureReason, "media_fetch_fail");
        }
        if (r6.A1m()) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A01;
        }
        A0A(r6, num);
    }

    public final void A0C(C255773uh r5, boolean z) {
        String str;
        String str2 = r5.A0k;
        0qQ.A07(str2);
        Long A012 = A01(this, str2, A02(r5));
        if (A012 != null) {
            long longValue = A012.longValue();
            1QP r1 = this.A00;
            if (z) {
                str = "media_early_fetch_start";
            } else {
                str = "media_fetch_start";
            }
            r1.flowMarkPoint(longValue, str);
        }
    }

    public final void A0D(C255773uh r5, boolean z) {
        String str;
        String str2 = r5.A0k;
        0qQ.A07(str2);
        Long A012 = A01(this, str2, A02(r5));
        if (A012 != null) {
            long longValue = A012.longValue();
            1QP r1 = this.A00;
            if (z) {
                str = "media_early_fetch_success";
            } else {
                str = "media_fetch_success";
            }
            r1.flowMarkPoint(longValue, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (X.0qQ.A0K(r5, "disk") != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.C250973mM r4, java.lang.String r5) {
        /*
            r3 = this;
            com.instagram.common.session.UserSession r0 = r3.A01
            X.3uh r2 = r4.A08(r0)
            java.lang.String r0 = "memory"
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x0017
            java.lang.String r0 = "disk"
            boolean r1 = X.0qQ.A0K(r5, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            r3.A0B(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VC.A0E(X.3mM, java.lang.String):void");
    }

    public AnonymousClass6VC(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AnonymousClass1QO.A00(userSession);
    }

    public static final Long A01(AnonymousClass6VC r5, String str, String str2) {
        long A002 = A00(r5, str, str2);
        1QP r4 = r5.A00;
        if (!r4.isOngoingFlow(A002)) {
            A002 = A00(r5, str, (String) null);
            if (!r4.isOngoingFlow(A002)) {
                return null;
            }
        }
        return Long.valueOf(A002);
    }

    public static final String A02(C255773uh r1) {
        if (r1.A1N()) {
            return null;
        }
        return r1.A0j;
    }

    public static final void A03(Reel reel, C255773uh r9, AnonymousClass6VC r10) {
        String str;
        Integer num;
        String str2;
        String id = reel.getId();
        0qQ.A07(id);
        if (r9 != null) {
            str = A02(r9);
        } else {
            str = null;
        }
        Long A012 = A01(r10, id, str);
        if (A012 != null) {
            long longValue = A012.longValue();
            UserSession userSession = r10.A01;
            int size = reel.A0O(userSession).size();
            int A04 = (int) reel.A04();
            boolean A0e = reel.A0e();
            if (reel.A0z(userSession)) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            1QP r4 = r10.A00;
            r4.flowAnnotate(longValue, "number_of_segments", size);
            r4.flowAnnotate(longValue, "tray_position", A04);
            r4.flowAnnotate(longValue, "self_story", A0e);
            if (num.intValue() != 0) {
                str2 = "network";
            } else {
                str2 = "cache";
            }
            r4.flowAnnotate(longValue, "json_fetch_mode", str2);
        }
    }

    public static final void A04(Reel reel, C255773uh r10, AnonymousClass6VC r11) {
        Integer num;
        Integer num2;
        String str;
        ArrayList arrayList;
        Integer num3;
        String str2;
        if (!r10.A1N()) {
            String str3 = r10.A0k;
            0qQ.A07(str3);
            Long A012 = A01(r11, str3, A02(r10));
            if (A012 != null) {
                long longValue = A012.longValue();
                UserSession userSession = r11.A01;
                int indexOf = reel.A0O(userSession).indexOf(r10);
                if (r10.CcK()) {
                    num = AnonymousClass05K.A01;
                } else if (r10.A1P()) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A00;
                }
                1iA A0C = r10.A0C();
                boolean A0m = r10.A0m();
                if (r10.A1m() && r10.A0m() && !C305976Kh.A01(userSession, r10)) {
                    num2 = AnonymousClass05K.A00;
                } else if (!r10.A1m() || !C305976Kh.A01(userSession, r10)) {
                    num2 = AnonymousClass05K.A0C;
                } else {
                    num2 = AnonymousClass05K.A01;
                }
                boolean A1s = r10.A1s(userSession);
                if (indexOf != -1) {
                    r11.A00.flowAnnotate(longValue, "segment_position", indexOf);
                }
                1QP r5 = r11.A00;
                r5.flowAnnotate(longValue, "segment_type", AnonymousClass6VF.A00(num));
                r5.flowAnnotate(longValue, "has_audio", A0m);
                switch (num2.intValue()) {
                    case 0:
                        str = "available";
                        break;
                    case 1:
                        str = "available_but_muted";
                        break;
                    default:
                        str = "unavailable";
                        break;
                }
                r5.flowAnnotate(longValue, "audio_availability", str);
                1Xj r0 = r10.A0b;
                String str4 = null;
                if (r0 != null) {
                    str4 = r0.getId();
                }
                r5.flowAnnotate(longValue, "media_id", str4);
                List<C255783ui> A0b = r10.A0b();
                if (A0b == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    for (C255783ui r02 : A0b) {
                        arrayList.add(r02.A11.toString());
                    }
                }
                r5.flowAnnotate(longValue, "story_sticker_type", String.valueOf(arrayList));
                if (A0C != null) {
                    r5.flowAnnotate(longValue, "media_type", A0C.name());
                }
                Boolean bool = r10.A0G;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        num3 = AnonymousClass05K.A00;
                    } else {
                        num3 = AnonymousClass05K.A01;
                    }
                    if (num3.intValue() != 0) {
                        str2 = "network";
                    } else {
                        str2 = "cache";
                    }
                    r5.flowAnnotate(longValue, "media_fetch_mode", str2);
                }
                r5.flowAnnotate(longValue, "is_showing_deletion_error", A1s);
            }
        }
    }
}
