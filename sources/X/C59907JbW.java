package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.JbW  reason: case insensitive filesystem */
public final class C59907JbW extends C59908JbX {
    public static final ConcurrentHashMap A03 = new ConcurrentHashMap();
    public final UserSession A00;
    public final ClipInfo A01;
    public final AnonymousClass3Q2 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59907JbW(Context context, UserSession userSession, AnonymousClass3Q2 r4) {
        super(context);
        0qQ.A0B(r4, 1);
        this.A02 = r4;
        this.A00 = userSession;
        this.A01 = r4.A1N;
    }

    public static final String A01(Boolean bool) {
        if (0qQ.A0K(bool, true)) {
            return "true";
        }
        return null;
    }

    public static final Long A00(AnonymousClass3Q2 r1) {
        if (r1.A6C) {
            return r1.A2I;
        }
        String str = r1.A32;
        if (str == null || str.length() == 0) {
            return null;
        }
        return AnonymousClass7TE.A10(str);
    }

    public final Long A08() {
        long j;
        int i;
        AnonymousClass3Q2 r2 = this.A02;
        if (r2.A12()) {
            i = JTO.A09(r2.A1N);
        } else if (r2.A1G == 1iA.A07) {
            C273744n7 r0 = r2.A1L;
            if (r0 == null) {
                return null;
            }
            i = r0.A00;
        } else if (!r2.A0y()) {
            return null;
        } else {
            AnonymousClass3QF r22 = r2.A1T;
            if (r22.A03 != 2) {
                return null;
            }
            j = r22.A05;
            return Long.valueOf(j);
        }
        j = (long) i;
        return Long.valueOf(j);
    }

    public final Long A09() {
        String str;
        AnonymousClass3Q2 r3 = this.A02;
        boolean z = true;
        if (r3.A12()) {
            Long valueOf = Long.valueOf(r3.A0d);
            if (valueOf.longValue() > 0) {
                return valueOf;
            }
        } else if (r3.A1G == 1iA.A07) {
            C273744n7 r1 = r3.A1L;
            if (r1 != null && (str = r1.A01) != null) {
                return Long.valueOf(0mb.A03(str));
            }
            if (r1 == null) {
                z = false;
            }
            0wb.A03("log_data_helper_get_file_size_bytes", 002.A1D("has audio clip info:", z));
            return null;
        } else if (r3.A0y()) {
            return A0A();
        }
        return null;
    }

    public final Long A0A() {
        String str = this.A02.A33;
        if (str != null) {
            return Long.valueOf(0mb.A03(str));
        }
        0wb.A03("log_data_helper_get_file_size_bytes", "has image file path:false");
        return null;
    }

    public final Long A0B() {
        AnonymousClass3Q2 r1 = this.A02;
        if (r1.A12() || r1.A0y()) {
            return DbS.A0j(r1.A0R);
        }
        return null;
    }

    public final Long A0C() {
        Object obj;
        AnonymousClass3Q2 r6 = this.A02;
        if (r6.A5D) {
            return null;
        }
        Long A002 = A00(r6);
        if (r6.A5u && A002 == null) {
            if (182.A06(0Tu.A05, this.A00, 36327207051737319L)) {
                Iterator A0g = JTQ.A0g(r6);
                while (true) {
                    if (!A0g.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = A0g.next();
                    if (A00((AnonymousClass3Q2) obj) != null) {
                        break;
                    }
                }
                AnonymousClass3Q2 r1 = (AnonymousClass3Q2) obj;
                if (r1 != null) {
                    return A00(r1);
                }
                return null;
            }
        }
        return A002;
    }

    public final Long A0D() {
        AnonymousClass3Q2 r1 = this.A02;
        if (r1.A12() || r1.A0y()) {
            return DbS.A0j(r1.A0S);
        }
        return null;
    }

    public final Long A0E() {
        String str;
        long A032;
        AnonymousClass3Q2 r3 = this.A02;
        if (r3.A12()) {
            A032 = C379909Vu.A00(r3);
        } else {
            if (r3.A1G == 1iA.A07) {
                C273744n7 r0 = r3.A1L;
                if (r0 == null || (str = r0.A01) == null) {
                    return null;
                }
            } else if (!r3.A0y()) {
                return null;
            } else {
                str = r3.A3K;
            }
            A032 = 0mb.A03(str);
        }
        return Long.valueOf(A032);
    }

    public final Long A0F() {
        int i;
        AnonymousClass3Q2 r1 = this.A02;
        if (r1.A12()) {
            i = this.A01.A06;
        } else if (!r1.A0y()) {
            return null;
        } else {
            i = r1.A0G;
        }
        return Long.valueOf((long) i);
    }

    public final Long A0G() {
        int i;
        AnonymousClass3Q2 r1 = this.A02;
        if (r1.A12()) {
            i = this.A01.A09;
        } else if (!r1.A0y()) {
            return null;
        } else {
            i = r1.A0H;
        }
        return Long.valueOf((long) i);
    }

    public final String A0H() {
        AnonymousClass3Q2 r1 = this.A02;
        if (r1.A5p) {
            return 002.A0C(r1.A3t, '1');
        }
        return r1.A3t;
    }

    public final String A0I() {
        1iA r1;
        AnonymousClass3Q2 r2 = this.A02;
        if (r2.A12() || (r1 = r2.A1G) == 1iA.A0W || r1 == 1iA.A07) {
            return C59906JbV.A04(r2);
        }
        return null;
    }

    public final boolean A0J() {
        AnonymousClass3Q2 r1 = this.A02;
        if (r1.A3O != null || r1.A5u) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map A07() {
        /*
            r7 = this;
            java.util.Map r4 = super.A07()
            X.3Q2 r5 = r7.A02
            X.3QF r2 = r5.A1T
            monitor-enter(r2)
            int r1 = r2.A01     // Catch:{ all -> 0x041a }
            int r0 = r1 + 1
            r2.A01 = r0     // Catch:{ all -> 0x041a }
            monitor-exit(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "event_counter"
            r4.put(r0, r1)
            java.lang.String r1 = r5.A2X
            if (r1 != 0) goto L_0x001f
            java.lang.String r1 = "unknown"
        L_0x001f:
            java.lang.String r0 = "camera_session_id"
            r4.put(r0, r1)
            java.util.List r0 = r5.A0L()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            java.lang.String r3 = "sub_media_upload_ids"
            if (r0 == 0) goto L_0x004e
            java.util.List r0 = r5.A0L()
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x003c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r1.next()
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            java.lang.String r0 = r0.A3t
            r2.add(r0)
            goto L_0x003c
        L_0x004e:
            java.util.List r0 = r5.A0M()
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0063
            java.util.List r2 = r5.A0M()
        L_0x005c:
            java.lang.String r0 = r2.toString()
            r4.put(r3, r0)
        L_0x0063:
            java.lang.String r1 = r5.A2b
            java.lang.String r0 = "feed"
            boolean r0 = r0.equals(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = A01(r0)
            java.lang.String r0 = "is_panavision"
            r4.put(r0, r1)
            java.lang.String r0 = r5.A3n
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = A01(r0)
            java.lang.String r0 = "is_from_template"
            r4.put(r0, r1)
            boolean r0 = r5.A5S
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = A01(r0)
            java.lang.String r0 = "from_draft"
            r4.put(r0, r1)
            boolean r0 = r5.A5w
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = A01(r0)
            java.lang.String r0 = "is_story_template"
            r4.put(r0, r1)
            java.util.List r0 = r5.A4g
            r2 = 0
            if (r0 == 0) goto L_0x0164
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x00b6:
            java.lang.String r1 = A01(r0)
            java.lang.String r0 = "has_static_sticker"
            r4.put(r0, r1)
            boolean r0 = r5.A57
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = A01(r0)
            java.lang.String r0 = "has_animated_sticker"
            r4.put(r0, r1)
            java.util.List r0 = r5.A4o
            if (r0 == 0) goto L_0x0161
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x00da:
            java.lang.String r1 = A01(r0)
            java.lang.String r0 = "has_timed_sticker"
            r4.put(r0, r1)
            java.util.List r0 = r5.A4b
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = A01(r0)
            java.lang.String r0 = "has_interactive_sticker"
            r4.put(r0, r1)
            com.instagram.camera.effect.models.CameraAREffect r0 = r5.A10
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = A01(r0)
            java.lang.String r0 = "has_ar_effect"
            r4.put(r0, r1)
            X.3QG r0 = r5.A1i
            int r0 = r0.A01
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r1 = A01(r0)
            java.lang.String r0 = "has_video_filter"
            r4.put(r0, r1)
            X.51W r0 = r5.A1P
            if (r0 == 0) goto L_0x015f
            java.util.List r0 = r0.A01()
            if (r0 == 0) goto L_0x015f
            java.lang.Integer r0 = X.C51968G9o.A0t(r0)
            java.lang.String r1 = r0.toString()
        L_0x0130:
            java.lang.String r0 = "num_clip_segments"
            r4.put(r0, r1)
            X.51W r0 = r5.A1P
            if (r0 == 0) goto L_0x0167
            java.util.List r0 = r0.A01()
            if (r0 == 0) goto L_0x0167
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0147:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r1.next()
            X.51N r0 = (X.AnonymousClass51N) r0
            int r0 = r0.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            goto L_0x0147
        L_0x015f:
            r1 = r2
            goto L_0x0130
        L_0x0161:
            r0 = r2
            goto L_0x00da
        L_0x0164:
            r0 = r2
            goto L_0x00b6
        L_0x0167:
            r1 = r2
            goto L_0x016d
        L_0x0169:
            java.lang.String r1 = r3.toString()
        L_0x016d:
            java.lang.String r0 = "clip_segment_widths"
            r4.put(r0, r1)
            X.51W r0 = r5.A1P
            if (r0 == 0) goto L_0x019c
            java.util.List r0 = r0.A01()
            if (r0 == 0) goto L_0x019c
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0184:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x019e
            java.lang.Object r0 = r1.next()
            X.51N r0 = (X.AnonymousClass51N) r0
            int r0 = r0.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.add(r0)
            goto L_0x0184
        L_0x019c:
            r1 = r2
            goto L_0x01a2
        L_0x019e:
            java.lang.String r1 = r3.toString()
        L_0x01a2:
            java.lang.String r0 = "clip_segment_heights"
            r4.put(r0, r1)
            X.51W r0 = r5.A1P
            if (r0 == 0) goto L_0x01d1
            java.util.List r0 = r0.A01()
            if (r0 == 0) goto L_0x01d1
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x01b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r0 = r1.next()
            X.51N r0 = (X.AnonymousClass51N) r0
            boolean r0 = r0.A09()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.add(r0)
            goto L_0x01b9
        L_0x01d1:
            r1 = r2
            goto L_0x01d7
        L_0x01d3:
            java.lang.String r1 = r3.toString()
        L_0x01d7:
            java.lang.String r0 = "clip_segment_fill_screens"
            r4.put(r0, r1)
            X.28D r0 = r5.A0i
            if (r0 == 0) goto L_0x0417
            java.lang.String r1 = r0.name()
        L_0x01e4:
            java.lang.String r0 = "camera_entry_point"
            r4.put(r0, r1)
            com.instagram.pendingmedia.model.constants.ShareType r0 = r5.A0E()
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "share_type"
            r4.put(r0, r1)
            X.3QD r0 = r5.A6J
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "target_status"
            r4.put(r0, r1)
            X.3QD r0 = r5.A1f
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "server_status"
            r4.put(r0, r1)
            boolean r0 = r5.A6C
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "should_upload_over_fb"
            r4.put(r0, r1)
            int r0 = r5.A0Q
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "upload_manual_retry_count"
            r4.put(r0, r1)
            X.3QF r0 = r5.A1T
            java.lang.Integer r0 = r0.A06
            if (r0 == 0) goto L_0x0231
            java.lang.String r1 = X.C273764n9.A00(r0)
            java.lang.String r0 = "transcode_type"
            r4.put(r0, r1)
        L_0x0231:
            java.lang.String r0 = r5.A3X
            if (r0 == 0) goto L_0x0278
            com.instagram.common.session.UserSession r0 = r7.A00
            X.1E8 r1 = X.1E7.A00(r0)
            java.lang.String r0 = r5.A3X
            X.1Xj r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0255
            X.1Xy r0 = r0.A0C
            X.4oA r0 = r0.C5R()
            if (r0 == 0) goto L_0x0255
            java.lang.Boolean r0 = r0.AkK()
            if (r0 == 0) goto L_0x0255
            java.lang.String r2 = r0.toString()
        L_0x0255:
            r0 = 245(0xf5, float:3.43E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r4.put(r0, r2)
            X.3QO r0 = r5.A1F
            java.lang.String r1 = r0.toString()
            r0 = 3556(0xde4, float:4.983E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.put(r0, r1)
            int r0 = r5.A0J
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "media_reply_control"
            r4.put(r0, r1)
        L_0x0278:
            boolean r0 = r5.A5u
            if (r0 == 0) goto L_0x02ac
            java.util.List r1 = r5.A0L()
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto L_0x03f5
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x03f5
        L_0x028b:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "stack_photo_count"
            r4.put(r0, r1)
            java.util.List r1 = r5.A0L()
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 0
            if (r0 == 0) goto L_0x03da
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x03da
        L_0x02a3:
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "stack_video_count"
            r4.put(r0, r1)
        L_0x02ac:
            com.instagram.common.session.UserSession r6 = r7.A00
            X.1Av r0 = X.1Au.A00(r6)
            boolean r0 = r0.A1z()
            if (r0 == 0) goto L_0x02bf
            java.lang.String r1 = "high_quality"
            java.lang.String r0 = "true"
            r4.put(r1, r0)
        L_0x02bf:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 < r0) goto L_0x0300
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316976439628515(0x810619000012e3, double:3.0303403649228634E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            if (r0 == 0) goto L_0x0300
            android.content.Context r1 = r7.A00
            java.lang.String r0 = "power"
            java.lang.Object r2 = r1.getSystemService(r0)
            boolean r0 = r2 instanceof android.os.PowerManager
            if (r0 == 0) goto L_0x0300
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            if (r2 == 0) goto L_0x0300
            int r0 = r2.getCurrentThermalStatus()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "thermal_stat"
            r4.put(r0, r1)
            r0 = 30
            if (r3 < r0) goto L_0x0300
            float r0 = r2.getThermalHeadroom(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "thermal_headroom"
            r4.put(r0, r1)
        L_0x0300:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r5.A13
            java.lang.String r1 = r0.A03
            if (r1 != 0) goto L_0x030a
            X.3QF r0 = r5.A1T
            java.lang.String r1 = r0.A09
        L_0x030a:
            java.lang.String r0 = "external_app"
            r4.put(r0, r1)
            X.3QF r0 = r5.A1T
            java.lang.String r1 = r0.A08
            java.lang.String r0 = "external_app_metadata"
            r4.put(r0, r1)
            X.3QF r0 = r5.A1T
            java.util.Set r0 = r0.A0F
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "source_format"
            r4.put(r0, r1)
            java.util.List r0 = r5.A4m
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != 0) goto L_0x0335
            java.lang.String r0 = r5.A3Q
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 == 0) goto L_0x0348
        L_0x0335:
            java.lang.String r0 = r5.A3X
            if (r0 == 0) goto L_0x03d6
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x033b:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x03d2
            java.lang.String r1 = "reply"
        L_0x0343:
            java.lang.String r0 = "post_type"
            r4.put(r0, r1)
        L_0x0348:
            X.3QF r0 = r5.A1T
            int r0 = r0.A03
            if (r0 == 0) goto L_0x0357
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "ptv_type"
            r4.put(r0, r1)
        L_0x0357:
            X.3QF r0 = r5.A1T
            java.lang.String r1 = r0.A07
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0366
            java.lang.String r0 = "download_bandwidth"
            r4.put(r0, r1)
        L_0x0366:
            boolean r0 = r5.A5B
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "ads_mode_boost_story_enabled"
            r4.put(r0, r1)
            java.util.HashMap r0 = r5.A44
            if (r0 == 0) goto L_0x037b
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L_0x037d
        L_0x037b:
            java.lang.String r1 = "empty"
        L_0x037d:
            java.lang.String r0 = "exif_metadata"
            r4.put(r0, r1)
            com.instagram.pendingmedia.model.constants.ShareType r0 = r5.A0E()
            com.instagram.pendingmedia.model.constants.ShareType r2 = com.instagram.pendingmedia.model.constants.ShareType.DIRECT_SHARE
            if (r0 != r2) goto L_0x03cf
            boolean r0 = r5.A5h
        L_0x038c:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "is_optimistic_upload"
            r4.put(r0, r1)
            com.instagram.pendingmedia.model.constants.ShareType r0 = r5.A0E()
            r6 = 0
            if (r0 != r2) goto L_0x03c5
            boolean r0 = r5.A0y()
            if (r0 == 0) goto L_0x03c5
            java.lang.String r5 = r5.A3L
            r3 = 1
            if (r5 == 0) goto L_0x03c5
            int r0 = r5.length()
            if (r0 == 0) goto L_0x03c5
            java.util.concurrent.ConcurrentHashMap r2 = A03
            X.MPM r1 = X.MPM.A00
            X.MB9 r0 = new X.MB9
            r0.<init>(r1)
            java.lang.Object r0 = r2.compute(r5, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x03c5
            int r0 = r0.intValue()
            if (r0 <= r3) goto L_0x03c5
            r6 = 1
        L_0x03c5:
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "is_duplicate_upload"
            r4.put(r0, r1)
            return r4
        L_0x03cf:
            boolean r0 = r5.A5g
            goto L_0x038c
        L_0x03d2:
            java.lang.String r1 = "original"
            goto L_0x0343
        L_0x03d6:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x033b
        L_0x03da:
            java.util.Iterator r3 = r1.iterator()
        L_0x03de:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r0 = r3.next()
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            X.1iA r1 = r0.A1G
            X.1iA r0 = X.1iA.A0a
            if (r1 != r0) goto L_0x03de
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x03de
            goto L_0x040f
        L_0x03f5:
            java.util.Iterator r3 = r1.iterator()
        L_0x03f9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x028b
            java.lang.Object r0 = r3.next()
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            X.1iA r1 = r0.A1G
            X.1iA r0 = X.1iA.A0Q
            if (r1 != r0) goto L_0x03f9
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x03f9
        L_0x040f:
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0417:
            r1 = r2
            goto L_0x01e4
        L_0x041a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59907JbW.A07():java.util.Map");
    }
}
