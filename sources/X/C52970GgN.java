package X;

import android.app.Application;
import android.graphics.Bitmap;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.imagine.memu.impl.data.MEmuDataRepository;
import com.meta.metaai.imagine.memu.impl.service.MEmuNetworkService;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.GgN  reason: case insensitive filesystem */
public final class C52970GgN extends C361478gI {
    public int A00;
    public Integer A01;
    public AnonymousClass62P A02;
    public C262204Co A03;
    public C262204Co A04;
    public boolean A05;
    public boolean A06;
    public final QuickPerformanceLogger A07;
    public final FoaUserSession A08;
    public final I49 A09;
    public final MEmuDataRepository A0A;
    public final HMO A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0r6 A0H;
    public final 0V2 A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final 05G A0M;
    public final AnonymousClass0Ud A0N;
    public final AnonymousClass0Ud A0O;
    public final AnonymousClass0Ud A0P;
    public final AnonymousClass0Ud A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final Application A0T;
    public final MEmuNetworkService A0U;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52970GgN(Application application, FoaUserSession foaUserSession, I49 i49, HMQ hmq, String str, String str2, boolean z, boolean z2) {
        super(application);
        HMO hmo;
        AnonymousClass7TF.A1B(application, 1, foaUserSession);
        AnonymousClass7TF.A1E(hmq, 3, i49);
        this.A0T = application;
        this.A08 = foaUserSession;
        this.A0R = z;
        this.A0C = str;
        this.A0D = str2;
        this.A09 = i49;
        this.A0S = z2;
        0eO r1 = 0eO.A02;
        this.A0F = AnonymousClass0eN.A00(r1, C58714IwN.A01(this, 42));
        02z A10 = DbS.A10(hmq);
        this.A0M = A10;
        this.A0Q = A10;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this.A0I = A012;
        this.A0H = A012;
        02z A102 = DbS.A10(C54638HLv.A02);
        this.A0L = A102;
        this.A0P = A102;
        02z A103 = DbS.A10(HLM.DEFAULT);
        this.A0J = A103;
        this.A0N = A103;
        int ordinal = hmq.ordinal();
        if (ordinal == 0) {
            hmo = HMO.NUX;
        } else if (ordinal == 1) {
            hmo = HMO.CAPTURE_CONSENT;
        } else if (ordinal != 16) {
            hmo = HMO.ONBOARDING;
        } else {
            hmo = HMO.EXTENDED_CAPTURE;
        }
        this.A0B = hmo;
        02z A104 = DbS.A10(hmo);
        this.A0K = A104;
        this.A0O = A104;
        this.A07 = C51965G9l.A0l();
        this.A0G = AnonymousClass0eN.A00(r1, C58714IwN.A01(this, 43));
        this.A0E = AnonymousClass7TE.A1C();
        MEmuNetworkService mEmuNetworkService = new MEmuNetworkService(DbT.A05(application), foaUserSession);
        this.A0U = mEmuNetworkService;
        this.A0A = new MEmuDataRepository(mEmuNetworkService);
        this.A01 = num;
    }

    public static final void A01(C52970GgN ggN) {
        Object value;
        HMO hmo;
        05G r2 = ggN.A0J;
        do {
        } while (!r2.AIY(r2.getValue(), HLM.DEFAULT));
        05G r4 = ggN.A0K;
        do {
            value = r4.getValue();
            int ordinal = ((HMQ) ggN.A0M.getValue()).ordinal();
            if (ordinal == 1) {
                hmo = HMO.FINISH_NO_CONSENT;
            } else if (ordinal == 12 || ordinal == 13) {
                hmo = HMO.FINISH_SUCCESS;
            } else if (ordinal != 14) {
                QuickPerformanceLogger quickPerformanceLogger = ggN.A07;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerEnd(164823041, 4);
                }
                hmo = HMO.FINISH_INCOMPLETE;
            } else {
                hmo = HMO.FINISH_FAILURE;
            }
        } while (!r4.AIY(value, hmo));
    }

    public static final void A02(C52970GgN ggN) {
        int i = ggN.A00 + 1;
        ggN.A00 = i;
        if (i >= DbS.A05(ggN.A0G.getValue())) {
            ggN.A06 = false;
            05G r2 = ggN.A0J;
            do {
            } while (!r2.AIY(r2.getValue(), HLM.DEFAULT));
            05G r22 = ggN.A0K;
            do {
            } while (!r22.AIY(r22.getValue(), HMO.EXTENDED_CAPTURE));
            05G r23 = ggN.A0M;
            do {
            } while (!r23.AIY(r23.getValue(), HMQ.IMAGE_PICKER));
            return;
        }
        05G r24 = ggN.A0M;
        do {
        } while (!r24.AIY(r24.getValue(), HMQ.DETECTOR_READY));
    }

    public final C56124HtC A0E() {
        C54651HMi hMi;
        int i = this.A00;
        AnonymousClass0eM r7 = this.A0G;
        if (i >= DbS.A05(r7.getValue())) {
            hMi = null;
        } else {
            hMi = (C54651HMi) ((List) r7.getValue()).get(this.A00);
        }
        boolean z = true;
        int i2 = this.A00 + 1;
        if (hMi != C54651HMi.CENTER) {
            if (182.A06(0Tu.A05, C56316HwT.A00(this.A08), 36325836958020882L)) {
                z = false;
            }
        }
        return new C56124HtC(hMi, i2, DbS.A05(r7.getValue()), z);
    }

    public final void A0F(HQ4 hq4) {
        HOW how;
        Integer num;
        Integer num2;
        Object value;
        HMQ hmq;
        String str;
        int i;
        Object value2;
        HMQ hmq2;
        String str2;
        HQ4 hq42 = hq4;
        if (!(hq42 instanceof HIX)) {
            if (hq42 instanceof HIV) {
                05G r2 = this.A0L;
                do {
                } while (!r2.AIY(r2.getValue(), C54638HLv.A02));
                return;
            } else if (hq42 instanceof C54541HIc) {
                05G r22 = this.A0K;
                do {
                } while (!r22.AIY(r22.getValue(), HMO.CAPTURE_CONSENT));
                05G r23 = this.A0M;
                do {
                } while (!r23.AIY(r23.getValue(), HMQ.CAPTURE_CONSENT));
                return;
            } else if (hq42 instanceof HIQ) {
                JSONObject jSONObject = ((HIQ) hq42).A00;
                String string = jSONObject.getString("event");
                0qQ.A0A(string);
                0qQ.A0B(string, 0);
                Integer[] A002 = AnonymousClass05K.A00(3);
                int length = A002.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        num = A002[i2];
                        switch (num.intValue()) {
                            case 1:
                                str2 = "MEMU_FACE_CT_CHANGE";
                                break;
                            case 2:
                                str2 = "MEMU_DETECTION_RESULT";
                                break;
                            default:
                                str2 = "MEMU_EFFECT_READY";
                                break;
                        }
                        if (!str2.equals(AnonymousClass7TF.A0k(string))) {
                            i2++;
                        }
                    } else {
                        num = null;
                    }
                }
                05G r6 = this.A0M;
                boolean A003 = C55224HeF.A00((HMQ) r6.getValue());
                Integer num3 = AnonymousClass05K.A00;
                if (num != num3) {
                    Integer num4 = AnonymousClass05K.A01;
                    if (num == num4) {
                        boolean z = false;
                        if (jSONObject.has("data")) {
                            String string2 = jSONObject.getString("data");
                            0qQ.A07(string2);
                            i = Integer.parseInt(string2);
                        } else {
                            i = 0;
                        }
                        do {
                            value2 = r6.getValue();
                            if (i == 0) {
                                hmq2 = HMQ.POSE_FIND_FACE;
                            } else if (i > 1) {
                                hmq2 = HMQ.POSE_TOO_MANY_FACES;
                            } else if (i != 1 || !this.A05) {
                                hmq2 = HMQ.POSE_DETECTING;
                            } else {
                                hmq2 = HMQ.DETECTOR_READY;
                            }
                        } while (!r6.AIY(value2, hmq2));
                        if (this.A05 || i != 1) {
                            C51970G9q.A1S(this.A04);
                            this.A00 = 0;
                            018.A1A(this.A0E, J5T.A00);
                        }
                        if (!this.A05 && i == 1) {
                            z = true;
                        }
                        this.A05 = z;
                        return;
                    } else if (A003 && num == AnonymousClass05K.A0C && jSONObject.has("data")) {
                        String string3 = jSONObject.getString("data");
                        0qQ.A07(string3);
                        Integer[] A004 = AnonymousClass05K.A00(7);
                        int length2 = A004.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                num2 = A004[i3];
                                switch (num2.intValue()) {
                                    case 1:
                                        str = "DETECTED";
                                        break;
                                    case 2:
                                        str = "CENTER_FACE";
                                        break;
                                    case 3:
                                        str = "TOO_CLOSE";
                                        break;
                                    case 4:
                                        str = AnonymousClass000.A00(2508);
                                        break;
                                    case 5:
                                        str = "POSE_NOT_DETECTED";
                                        break;
                                    case 6:
                                        str = "FRAME_TOO_DARK";
                                        break;
                                    default:
                                        str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                                        break;
                                }
                                if (!str.equals(AnonymousClass7TF.A0k(string3))) {
                                    i3++;
                                } else if (num2 == num3) {
                                    return;
                                }
                            } else {
                                num2 = null;
                            }
                        }
                        do {
                            value = r6.getValue();
                            if (num2 != null) {
                                int intValue = num2.intValue();
                                if (intValue == 1) {
                                    hmq = HMQ.POSE_DETECTED;
                                } else if (intValue == 2) {
                                    hmq = HMQ.POSE_CENTER_FACE;
                                } else if (intValue == 3) {
                                    hmq = HMQ.POSE_TOO_CLOSE;
                                } else if (intValue == 4) {
                                    hmq = HMQ.POSE_TOO_FAR;
                                } else if (intValue == 6) {
                                    hmq = HMQ.FRAME_TOO_DARK;
                                }
                            }
                            hmq = HMQ.POSE_DETECTING;
                        } while (!r6.AIY(value, hmq));
                        C56124HtC A0E2 = A0E();
                        C51970G9q.A1S(this.A04);
                        if (num2 == num4 && !A0E2.A03) {
                            AnonymousClass4D7 A0t = C51975G9x.A0t(this.A04);
                            this.A04 = 1Eo.A03(num3, AnonymousClass12W.A00, new C58106ImS((Object) this, A0t, 45), C318116oQ.A00(this));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    do {
                    } while (!r6.AIY(r6.getValue(), HMQ.POSE_FIND_FACE));
                    this.A00 = 0;
                    018.A1A(this.A0E, J5U.A00);
                    return;
                }
            } else if (hq42 instanceof HIY) {
                this.A01 = AnonymousClass05K.A0C;
                05G r24 = this.A0L;
                do {
                } while (!r24.AIY(r24.getValue(), C54638HLv.SHOW_EFFECT_LOAD_FAILURE_DIALOG));
                return;
            } else if (hq42 instanceof HIT) {
                C58106ImS.A03(this, C318116oQ.A00(this), 46);
                return;
            } else if (hq42 instanceof HIP) {
                Bitmap bitmap = ((HIP) hq42).A00;
                AnonymousClass0eM r3 = this.A0G;
                int ordinal = ((C54651HMi) ((List) r3.getValue()).get(this.A00)).ordinal();
                if (ordinal == 2) {
                    how = HOW.CENTER;
                } else if (ordinal != 0) {
                    if (ordinal == 1) {
                        how = HOW.RIGHT;
                    }
                    this.A0E.add(new C56104Hsr(A00(bitmap), (C54651HMi) ((List) r3.getValue()).get(this.A00), (String) null));
                    A02(this);
                    return;
                } else {
                    how = HOW.LEFT;
                }
                I49.A00(C54687HOs.A03, (HOB) null, how, (C54680HOl) null, (C62650KkC) null, this.A09, (Integer) null, (Integer) null, (Integer) null, (JSONArray) null, false);
                this.A0E.add(new C56104Hsr(A00(bitmap), (C54651HMi) ((List) r3.getValue()).get(this.A00), (String) null));
                A02(this);
                return;
            } else if (hq42 instanceof HIS) {
                05G r25 = this.A0M;
                HMQ hmq3 = (HMQ) r25.getValue();
                0qQ.A0B(hmq3, 0);
                if (((hmq3 == HMQ.PRE_CAPTURE || C55224HeF.A00(hmq3)) && this.A00 > 0) || r25.getValue() == HMQ.UPLOADING) {
                    05G r26 = this.A0L;
                    do {
                    } while (!r26.AIY(r26.getValue(), C54638HLv.SHOW_EXIT_DIALOG));
                    return;
                }
            } else if (hq42 instanceof HIU) {
                this.A0K.Epw(HMO.NUX);
                return;
            } else if (hq42 instanceof HIR) {
                I49.A01(C54687HOs.A02, this.A09);
                05G r27 = this.A0K;
                do {
                } while (!r27.AIY(r27.getValue(), HMO.ONBOARDING));
                05G r28 = this.A0M;
                do {
                } while (!r28.AIY(r28.getValue(), HMQ.PRE_CAPTURE));
                return;
            } else if (hq42 instanceof HIW) {
                this.A01 = AnonymousClass05K.A01;
                I49.A01(C54687HOs.A05, this.A09);
            } else if (hq42 instanceof HIZ) {
                05G r29 = this.A0J;
                do {
                } while (!r29.AIY(r29.getValue(), HLM.LIGHT_MODE));
                return;
            } else if (hq42 instanceof C54540HIb) {
                05G r210 = this.A0K;
                do {
                } while (!r210.AIY(r210.getValue(), HMO.CONFIGURE_PRIVACY_SETTINGS));
                return;
            } else if (hq42 instanceof C54539HIa) {
                05G r211 = this.A0K;
                do {
                } while (!r211.AIY(r211.getValue(), HMO.ONBOARDING));
                05G r212 = this.A0M;
                do {
                } while (!r212.AIY(r212.getValue(), HMQ.PRE_CAPTURE));
                05G r213 = this.A0J;
                do {
                } while (!r213.AIY(r213.getValue(), HLM.LIGHT_MODE));
                return;
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        A01(this);
    }

    public final void onCleared() {
        C51970G9q.A1S(this.A03);
        C51970G9q.A1S(this.A04);
    }

    public static final Bitmap A00(Bitmap bitmap) {
        if (bitmap.getWidth() <= 1080 || bitmap.getHeight() <= 1080) {
            return bitmap;
        }
        Bitmap bitmap2 = bitmap;
        float min = ((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) / 1080.0f;
        if (min > 1.0f) {
            bitmap2 = C51976G9y.A05(bitmap, min);
            0qQ.A0A(bitmap2);
        }
        bitmap.recycle();
        return bitmap2;
    }

    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.HOB, java.lang.String, X.4D7] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a5, code lost:
        if (X.182.A06(X.0Tu.A05, X.C56316HwT.A00(r6.A08), 36325836958348565L) == false) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C52970GgN r17, java.util.List r18) {
        /*
            boolean r0 = r18.isEmpty()
            r6 = r17
            X.I49 r12 = r6.A09
            if (r0 == 0) goto L_0x005f
            r17 = 0
            X.HOs r7 = X.C54687HOs.A0K
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            r8 = 0
        L_0x0013:
            r9 = r8
            r10 = r8
            r11 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            X.I49.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.05G r2 = r6.A0K
        L_0x001f:
            java.lang.Object r1 = r2.getValue()
            X.HMO r0 = X.HMO.ONBOARDING
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x001f
            java.util.Iterator r5 = r18.iterator()
        L_0x002f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r1 = r5.next()
            X.Hsv r1 = (X.C56108Hsv) r1
            java.util.List r4 = r6.A0E
            X.HMi r3 = X.C54651HMi.CAMERA_ROLL
            android.app.Application r0 = r6.A0T
            android.net.Uri r1 = r1.A00
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.graphics.ImageDecoder$Source r0 = android.graphics.ImageDecoder.createSource(r0, r1)
            android.graphics.Bitmap r0 = android.graphics.ImageDecoder.decodeBitmap(r0)
            X.0qQ.A0A(r0)
            android.graphics.Bitmap r2 = A00(r0)
            X.Hsr r0 = new X.Hsr
            r0.<init>(r2, r3, r8)
            r4.add(r0)
            goto L_0x002f
        L_0x005f:
            int r0 = r18.size()
            X.HOs r7 = X.C54687HOs.A0H
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r8 = 0
            r17 = 0
            goto L_0x0013
        L_0x006d:
            boolean r0 = X.AnonymousClass7TE.A1b(r18)
            r6.A06 = r0
            X.05G r2 = r6.A0M
        L_0x0075:
            java.lang.Object r1 = r2.getValue()
            X.HMQ r0 = X.HMQ.UPLOADING
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0075
            com.facebook.quicklog.QuickPerformanceLogger r1 = r6.A07
            r0 = 164823041(0x9d30001, float:5.0796406E-33)
            r1.markerStart(r0)
            java.lang.String r1 = r6.A0C
            java.lang.String r0 = "AI_BOT"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00a7
            com.meta.foa.session.FoaUserSession r0 = r6.A08
            com.instagram.common.session.UserSession r3 = X.C56316HwT.A00(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325836958348565(0x810e2800123515, double:3.035943792639868E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r5 = 1
            if (r0 != 0) goto L_0x00a8
        L_0x00a7:
            r5 = 0
        L_0x00a8:
            X.6oS r4 = X.C318116oQ.A00(r6)
            X.4CZ r3 = X.AnonymousClass12W.A00
            r1 = 33
            X.JTe r0 = new X.JTe
            r0.<init>((java.lang.Object) r6, (X.AnonymousClass4D7) r8, (int) r1, (boolean) r5)
            X.1Eo.A05(r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52970GgN.A03(X.GgN, java.util.List):void");
    }

    public static final void A04(C52970GgN ggN, short s) {
        C318136oS A002 = C318116oQ.A00(ggN);
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
        1Eo.A05(AnonymousClass12y.A00, new C58106ImS(ggN, (AnonymousClass4D7) null, s), A002);
    }
}
