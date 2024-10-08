package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.IdA  reason: case insensitive filesystem */
public final class C57583IdA implements JSK {
    public final int EIY(HNO hno, boolean z) {
        int i;
        switch (DbU.A02(hno, 0)) {
            case 0:
            case 14:
            case 38:
            case 45:
            case 46:
                if (!z) {
                    return -14931149;
                }
                return -1842205;
            case 1:
            case 2:
                if (!z) {
                    return -12166551;
                }
                return -4934476;
            case 3:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 23:
            case 24:
                return 16777215;
            case 4:
            case 7:
                if (!z) {
                    return -1;
                }
                return -657931;
            case 5:
            case 6:
            case 15:
            case 25:
                if (!z) {
                    return -16751392;
                }
                return -11447983;
            case 8:
                return -14931149;
            case 9:
            case 10:
                if (!z) {
                    return -16448251;
                }
                return -328966;
            case 11:
            case 32:
            case 40:
            case 51:
            case 54:
                return -1;
            case 13:
                if (!z) {
                    return 167772160;
                }
                return 822083583;
            case 16:
                if (!z) {
                    return 2132552499;
                }
                return 1728053247;
            case 17:
                if (!z) {
                    return -16751407;
                }
                return -10835969;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return -16748304;
            case 19:
                i = -15263977;
                break;
            case 20:
                if (!z) {
                    return -920329;
                }
                return -14737633;
            case 21:
                if (!z) {
                    return -9996150;
                }
                return -8022620;
            case 22:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                if (z) {
                    return -12166551;
                }
                return -3419431;
            case 26:
                return -657931;
            case 27:
                return 872415231;
            case 28:
                if (!z) {
                    return -14931149;
                }
                return -920329;
            case 30:
                if (!z) {
                    return 167772160;
                }
                return 335544320;
            case 31:
            case 36:
                if (z) {
                    return -1;
                }
                return -16777216;
            case 33:
                return 335544320;
            case 34:
                i = 1090519039;
                break;
            case 35:
                return 1090190074;
            case 37:
                if (!z) {
                    return -1;
                }
                return 1090190074;
            case 39:
                if (!z) {
                    return -218103809;
                }
                return -232709336;
            case Seq.NULL_REFNUM:
            case 47:
                return 1459617792;
            case Seq.RefTracker.REF_OFFSET:
                if (!z) {
                    return -218103809;
                }
                return 1459617792;
            case 43:
                if (!z) {
                    return -14605528;
                }
                return -460295;
            case 44:
            case 48:
                if (!z) {
                    return -15986668;
                }
                return -460295;
            case 49:
                if (!z) {
                    return -1;
                }
                return 335544320;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                if (!z) {
                    return 335544320;
                }
                return 654311423;
            case 52:
                i = -15787746;
                break;
            case 53:
                if (!z) {
                    return -1711276033;
                }
                return -1728053248;
            default:
                throw AnonymousClass7TE.A1K();
        }
        if (!z) {
            return -1;
        }
        return i;
    }

    public final int EIZ(Integer num) {
        switch (C51967G9n.A03(num, 0)) {
            case 0:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 44:
                return 36;
            case 1:
            case 10:
            case 19:
            case 20:
                return 44;
            case 5:
            case 22:
            case 34:
            case 35:
            case 40:
                return 16;
            case 6:
                return 20;
            case 7:
            case 8:
            case 21:
            case 24:
            case 25:
            case 26:
            case 36:
                return 0;
            case 9:
                return 28;
            case 11:
            case 14:
            case 30:
            case 31:
                return 12;
            case 15:
                return 22;
            case 16:
                return 32;
            case 17:
            case Seq.NULL_REFNUM:
                return 48;
            case 27:
                return 4;
            case 28:
                return 3;
            case 33:
                return 64;
            case 39:
                return 24;
            case Seq.RefTracker.REF_OFFSET:
                return 345;
            case 43:
                return 18;
            case 45:
                return 34;
            default:
                return 8;
        }
    }

    public final boolean EIa(Integer num) {
        return C51975G9x.A1Q(C51967G9n.A03(num, 0), 0);
    }

    public final float EId(HLQ hlq, boolean z) {
        int A02 = DbU.A02(hlq, 0);
        if (A02 != 0) {
            if (A02 == 1) {
                return 0.1f;
            }
            throw AnonymousClass7TE.A1K();
        } else if (!z) {
            return 0.05f;
        } else {
            return 0.03f;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ae, code lost:
        r6 = X.AnonymousClass05K.A00;
        r5 = new X.C55432Hhc(1.001f);
        r9 = 0.06f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bf, code lost:
        r10 = 0.06f;
        r6 = new X.C55432Hhc(1.001f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ce, code lost:
        r5 = new X.C55432Hhc(1.04f);
        r9 = -0.02f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00db, code lost:
        return new X.C55796Hnc(r5, r6, r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fb, code lost:
        r6 = new X.C55432Hhc(1.17f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0111, code lost:
        r10 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011d, code lost:
        r6 = new X.C55432Hhc(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0125, code lost:
        r9 = 15.0f;
        r7 = X.AnonymousClass05K.A0N;
        r10 = -0.24f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x012c, code lost:
        r6 = new X.C55432Hhc(1.33f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0137, code lost:
        return new X.C55796Hnc(r6, r7, r8, r9, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C55796Hnc EIj(java.lang.Integer r12) {
        /*
            r11 = this;
            int r6 = r12.intValue()
            r5 = 1066779279(0x3f95c28f, float:1.17)
            r4 = 1068540887(0x3fb0a3d7, float:1.38)
            r3 = 1066192077(0x3f8ccccd, float:1.1)
            r2 = 1065688760(0x3f851eb8, float:1.04)
            r1 = 1065361605(0x3f8020c5, float:1.001)
            r0 = 1068121457(0x3faa3d71, float:1.33)
            switch(r6) {
                case 0: goto L_0x001e;
                case 1: goto L_0x002e;
                case 2: goto L_0x010b;
                case 3: goto L_0x00dc;
                case 4: goto L_0x00c8;
                case 5: goto L_0x0039;
                case 6: goto L_0x0041;
                case 7: goto L_0x0049;
                case 8: goto L_0x0059;
                case 9: goto L_0x0068;
                case 10: goto L_0x0075;
                case 11: goto L_0x0083;
                case 12: goto L_0x0091;
                case 13: goto L_0x0096;
                case 14: goto L_0x009d;
                case 15: goto L_0x00a7;
                case 16: goto L_0x00aa;
                case 17: goto L_0x00b9;
                case 18: goto L_0x00c8;
                case 19: goto L_0x00dc;
                case 20: goto L_0x00e9;
                case 21: goto L_0x00f4;
                case 22: goto L_0x0101;
                case 23: goto L_0x00e9;
                case 24: goto L_0x0113;
                case 25: goto L_0x0039;
                case 26: goto L_0x0041;
                case 27: goto L_0x0123;
                default: goto L_0x0019;
            }
        L_0x0019:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x001e:
            X.XSX r7 = X.XSX.OPTIMISTIC_TEXT_APP_REGULAR
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            X.Hhc r5 = new X.Hhc
            r5.<init>(r3)
            r8 = 1095761920(0x41500000, float:13.0)
            r9 = -1121724662(0xffffffffbd23d70a, float:-0.04)
            goto L_0x00d6
        L_0x002e:
            X.XSX r8 = X.XSX.OPTIMISTIC_TEXT_APP_REGULAR
            r9 = 1094713344(0x41400000, float:12.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r10 = -1121724662(0xffffffffbd23d70a, float:-0.04)
            goto L_0x011d
        L_0x0039:
            X.XSX r8 = X.XSX.SANS_SERIF
            r9 = 1094713344(0x41400000, float:12.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            goto L_0x0111
        L_0x0041:
            X.XSX r7 = X.XSX.OPTIMISTIC_TEXT_APP_REGULAR
            r8 = 1097859072(0x41700000, float:15.0)
            java.lang.Integer r6 = X.AnonymousClass05K.A0N
            goto L_0x00ce
        L_0x0049:
            X.XSX r8 = X.XSX.SANS_SERIF
            r9 = 1095761920(0x41500000, float:13.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r10 = -1113336054(0xffffffffbda3d70a, float:-0.08)
            X.Hhc r6 = new X.Hhc
            r6.<init>(r4)
            goto L_0x0131
        L_0x0059:
            X.XSX r7 = X.XSX.SANS_SERIF
            java.lang.Integer r6 = X.AnonymousClass05K.A0C
            X.Hhc r5 = new X.Hhc
            r5.<init>(r4)
            r8 = 1095761920(0x41500000, float:13.0)
            r9 = -1113336054(0xffffffffbda3d70a, float:-0.08)
            goto L_0x00d6
        L_0x0068:
            X.XSX r8 = X.XSX.OPTIMISTIC_TEXT_APP_REGULAR
            r9 = 1096810496(0x41600000, float:14.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r10 = -1138501878(0xffffffffbc23d70a, float:-0.01)
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L_0x011d
        L_0x0075:
            X.XSX r8 = X.XSX.OPTIMISTIC_TEXT_APP_REGULAR
            r9 = 1095761920(0x41500000, float:13.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r10 = -1113336054(0xffffffffbda3d70a, float:-0.08)
            r3 = 1067282596(0x3f9d70a4, float:1.23)
            goto L_0x011d
        L_0x0083:
            X.XSX r8 = X.XSX.OPTIMISTIC_TEXT_APP_BOLD
            r9 = 1103101952(0x41c00000, float:24.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r10 = 1039516303(0x3df5c28f, float:0.12)
            r3 = 1064682127(0x3f75c28f, float:0.96)
            goto L_0x011d
        L_0x0091:
            X.XSX r7 = X.XSX.OPTIMISTIC_TEXT_APP_BOLD
            r8 = 1099431936(0x41880000, float:17.0)
            goto L_0x00ae
        L_0x0096:
            X.XSX r8 = X.XSX.OPTIMISTIC_TEXT_APP_BOLD
            r9 = 1099431936(0x41880000, float:17.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            goto L_0x00bf
        L_0x009d:
            X.XSX r8 = X.XSX.OPTIMISTIC_TEXT_APP_REGULAR
            r9 = 1099431936(0x41880000, float:17.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r10 = -1093538939(0xffffffffbed1eb85, float:-0.41)
            goto L_0x00fb
        L_0x00a7:
            X.XSX r8 = X.XSX.OPTIMISTIC_TEXT_APP_REGULAR
            goto L_0x0125
        L_0x00aa:
            X.XSX r7 = X.XSX.OPTIMISTIC_TEXT_APP_REGULAR
            r8 = 1097859072(0x41700000, float:15.0)
        L_0x00ae:
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            X.Hhc r5 = new X.Hhc
            r5.<init>(r1)
            r9 = 1031127695(0x3d75c28f, float:0.06)
            goto L_0x00d6
        L_0x00b9:
            X.XSX r8 = X.XSX.OPTIMISTIC_TEXT_APP_BOLD
            r9 = 1097859072(0x41700000, float:15.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
        L_0x00bf:
            r10 = 1031127695(0x3d75c28f, float:0.06)
            X.Hhc r6 = new X.Hhc
            r6.<init>(r1)
            goto L_0x0131
        L_0x00c8:
            X.XSX r7 = X.XSX.OPTIMISTIC_TEXT_APP_REGULAR
            r8 = 1097859072(0x41700000, float:15.0)
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x00ce:
            X.Hhc r5 = new X.Hhc
            r5.<init>(r2)
            r9 = -1130113270(0xffffffffbca3d70a, float:-0.02)
        L_0x00d6:
            X.Hnc r4 = new X.Hnc
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L_0x00dc:
            X.XSX r8 = X.XSX.SANS_SERIF
            r9 = 1096810496(0x41600000, float:14.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r10 = -1105618534(0xffffffffbe19999a, float:-0.15)
            r3 = 1067702026(0x3fa3d70a, float:1.28)
            goto L_0x011d
        L_0x00e9:
            X.XSX r8 = X.XSX.SANS_SERIF
            r9 = 1096810496(0x41600000, float:14.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            r10 = 0
            r3 = 1067785912(0x3fa51eb8, float:1.29)
            goto L_0x011d
        L_0x00f4:
            X.XSX r8 = X.XSX.SANS_SERIF
            r9 = 1099431936(0x41880000, float:17.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            r10 = 0
        L_0x00fb:
            X.Hhc r6 = new X.Hhc
            r6.<init>(r5)
            goto L_0x0131
        L_0x0101:
            X.XSX r8 = X.XSX.SANS_SERIF
            r9 = 1098907648(0x41800000, float:16.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r10 = 0
            r3 = 1067450368(0x3fa00000, float:1.25)
            goto L_0x011d
        L_0x010b:
            X.XSX r8 = X.XSX.SANS_SERIF
            r9 = 1094713344(0x41400000, float:12.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
        L_0x0111:
            r10 = 0
            goto L_0x012c
        L_0x0113:
            X.XSX r8 = X.XSX.SANS_SERIF
            r9 = 1102053376(0x41b00000, float:22.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            r10 = 0
            r3 = 1067618140(0x3fa28f5c, float:1.27)
        L_0x011d:
            X.Hhc r6 = new X.Hhc
            r6.<init>(r3)
            goto L_0x0131
        L_0x0123:
            X.XSX r8 = X.XSX.SANS_SERIF
        L_0x0125:
            r9 = 1097859072(0x41700000, float:15.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            r10 = -1099578737(0xffffffffbe75c28f, float:-0.24)
        L_0x012c:
            X.Hhc r6 = new X.Hhc
            r6.<init>(r0)
        L_0x0131:
            X.Hnc r4 = new X.Hnc
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57583IdA.EIj(java.lang.Integer):X.Hnc");
    }
}
