package X;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.model.WallGifPostItem;
import com.instagram.wonderwall.model.WallMediaPostItem;
import com.instagram.wonderwall.model.WallMusicPostItem;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallRepostItem;
import com.instagram.wonderwall.model.WallTextPostItem;

public abstract class I5B {
    public static final void A00(C289525dk r10, C286575Wy r11, C62320sa r12, int i) {
        int i2;
        C62320sa r7 = r12;
        AnonymousClass7TF.A1H(r10, r12);
        C286575Wy r3 = r11;
        r11.ExV(990706841);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, r10) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, r12);
        }
        if ((i2 & 19) != 18 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-207116811, "com.instagram.wonderwall.ui.compose.components.RemoveAttachmentButton (WallAttachment.kt:153)");
            }
            I6X.A03(r3, r10.AAz(C287215Zl.A0D, G9w.A0G(Modifier.A00)), C287975bA.A00(r11, R.drawable.instagram_x_pano_outline_24, 0), C304346Dc.A00(r11, 2131971974), r7, (i2 << 6) & 7168, 0);
            if (0fL.A02()) {
                0fL.A00(-698335580);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, r10, r12, i, 20);
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.0r1, java.lang.Object] */
    public static final void A01(C286575Wy r14, C284945Oz r15, WallPostItem wallPostItem, int i) {
        int i2;
        WallMediaPostItem wallMediaPostItem;
        Medium medium;
        C284945Oz r4 = r15;
        WallPostItem wallPostItem2 = wallPostItem;
        boolean A1U = AnonymousClass7TF.A1U(0, wallPostItem2, r15);
        C286575Wy r3 = r14;
        r14.ExV(114111858);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, wallPostItem2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r14, r15);
        }
        if ((i2 & 19) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1027029974, "com.instagram.wonderwall.ui.compose.components.DraftVideoThumbnailEffect (WallAttachment.kt:176)");
            }
            if ((wallPostItem2 instanceof WallMediaPostItem) && (wallMediaPostItem = (WallMediaPostItem) wallPostItem2) != null && (medium = wallMediaPostItem.A00) != null && medium.CeS() == A1U) {
                Context A0N = C51970G9q.A0N(r3);
                UserSession A0f = C51970G9q.A0f(r3);
                ? obj = new Object();
                obj.A00 = A1U;
                String str = wallMediaPostItem.A02.A06;
                boolean A1Y = C51967G9n.A1Y(r3, str, 1471135655);
                Object ECw = r3.ECw();
                if (A1Y || ECw == AnonymousClass5XT.A00) {
                    ECw = new IOC(2, r4, obj);
                    r3.FLL(ECw);
                }
                C286565Wx A0H = C51965G9l.A0H(r3, false);
                boolean A1Y2 = C51967G9n.A1Y(r3, str, 1471152206);
                Object ECw2 = r3.ECw();
                if (A1Y2 || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new C355608Qq(A0N, A0f, AnonymousClass05K.A00, medium.A0B, medium.A04, false);
                    r3.FLL(ECw2);
                }
                C286565Wx.A0L(A0H, false);
                boolean A1Z = C51965G9l.A1Z(r3, ECw, C51973G9u.A1S(r3, ECw2, medium, 1471158260));
                Object ECw3 = r3.ECw();
                if (A1Z || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = new C52070GDq(ECw2, medium, ECw, (AnonymousClass4D7) null, 24);
                    r3.FLL(ECw3);
                }
                C51968G9o.A1E(r3, A0H, ECw3, str);
            }
            if (0fL.A02()) {
                0fL.A00(-1836060223);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, wallPostItem2, r4, i3, 19);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r24, X.C53029GhK r25, int r26) {
        /*
            r2 = 0
            r4 = r25
            X.0qQ.A0B(r4, r2)
            r0 = -1091453621(0xffffffffbef1bd4b, float:-0.47214732)
            r15 = r24
            r15.ExV(r0)
            r3 = r26
            r0 = r26 & 6
            r5 = 2
            if (r0 != 0) goto L_0x01d6
            int r1 = X.G9t.A0O(r15, r4)
            r1 = r1 | r26
        L_0x001b:
            r0 = r1 & 3
            if (r0 != r5) goto L_0x0033
            boolean r0 = r15.Bwn()
            if (r0 == 0) goto L_0x0033
            r15.Evl()
        L_0x0028:
            X.5Xd r1 = r15.ASQ()
            if (r1 == 0) goto L_0x0032
            r0 = 5
        L_0x002f:
            X.JGE.A01(r1, r4, r3, r0)
        L_0x0032:
            return
        L_0x0033:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0041
            r5 = -51293168(0xfffffffffcf15410, float:-1.0024388E37)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.WallDraftPostAttachmentPreview (WallAttachment.kt:107)"
            X.0fL.A01(r5, r0)
        L_0x0041:
            X.0Ud r0 = r4.A07
            r16 = 0
            java.lang.Object r0 = X.G9w.A0g(r15, r0, r2)
            X.Gm7 r0 = (X.C53321Gm7) r0
            X.YBO r9 = r0.A03
            if (r9 != 0) goto L_0x0063
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x005b
            r0 = 1743333885(0x67e929fd, float:2.2021719E24)
            X.0fL.A00(r0)
        L_0x005b:
            X.5Xd r1 = r15.ASQ()
            if (r1 == 0) goto L_0x0032
            r0 = 4
            goto L_0x002f
        L_0x0063:
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            r12 = 1094713344(0x41400000, float:12.0)
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A08(r5, r12)
            r7 = 6
            X.C289585dr.A00(r15, r0)
            r6 = 1
            androidx.compose.ui.Modifier r11 = X.C51966G9m.A0T(r5)
            X.5RD r8 = X.C51966G9m.A0a(r2)
            int r13 = X.C287425a7.A00(r15)
            r0 = r15
            X.5Wx r0 = (X.C286565Wx) r0
            X.5RM r5 = X.C286565Wx.A04(r0)
            androidx.compose.ui.Modifier r10 = X.C287435a8.A01(r15, r11)
            X.C51973G9u.A0y(r15, r0)
            X.C51971G9r.A12(r15, r8, r5)
            X.0sL r8 = X.C287485aD.A02
            boolean r5 = r0.A0K
            if (r5 != 0) goto L_0x0099
            boolean r5 = X.C51972G9s.A1Q(r15, r13)
            if (r5 != 0) goto L_0x009c
        L_0x0099:
            X.C51971G9r.A13(r15, r8, r13)
        L_0x009c:
            X.C51965G9l.A18(r15, r10)
            X.5dj r5 = X.C289515dj.A00
            boolean r8 = X.C53563GqZ.A00(r2, r9)
            if (r8 == 0) goto L_0x0114
            r8 = -719516241(0xffffffffd51d0daf, float:-1.0792631E13)
            r15.ExS(r8)
            X.GqZ r9 = (X.C53563GqZ) r9
            java.lang.Object r8 = r9.A01
            X.1Xj r8 = (X.1Xj) r8
            boolean r10 = r8.CeS()
            if (r10 == 0) goto L_0x017f
            r9 = -719479227(0xffffffffd51d9e45, float:-1.0831443E13)
            r15.ExS(r9)
            float r9 = r8.A0l()
            androidx.compose.ui.Modifier r9 = X.C54739HQw.A00(r11, r9, r2)
            androidx.compose.ui.Modifier r17 = X.C51968G9o.A0P(r9, r12)
            r21 = 384(0x180, float:5.38E-43)
            r22 = 248(0xf8, float:3.48E-43)
            r19 = r16
            r23 = r6
            r24 = r2
            r25 = r2
            r18 = r8
            r20 = r2
            X.I3E.A00(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x00de:
            X.C286565Wx.A0L(r0, r2)
        L_0x00e1:
            X.C286565Wx.A0L(r0, r2)
            r6 = 392477879(0x1764bcb7, float:7.3908965E-25)
            boolean r1 = X.C51974G9v.A1X(r15, r6, r1)
            java.lang.Object r6 = r15.ECw()
            if (r1 != 0) goto L_0x00f5
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r6 != r1) goto L_0x00ff
        L_0x00f5:
            r1 = 43
            X.Wvr r6 = new X.Wvr
            r6.<init>(r4, r1)
            r15.FLL(r6)
        L_0x00ff:
            X.0sa r0 = X.C51965G9l.A0y(r0, r6, r2)
            A00(r5, r15, r0, r7)
            boolean r0 = X.C51967G9n.A1R(r15)
            if (r0 == 0) goto L_0x0028
            r0 = -1815954490(0xffffffff93c2bbc6, float:-4.9157644E-27)
            X.0fL.A00(r0)
            goto L_0x0028
        L_0x0114:
            boolean r8 = r9 instanceof X.C53562GqY
            if (r8 == 0) goto L_0x0192
            r8 = 392448693(0x17644ab5, float:7.3765067E-25)
            r15.ExS(r8)
            X.GqY r9 = (X.C53562GqY) r9
            com.instagram.common.gallery.Medium r10 = r9.A00
            boolean r8 = r10.CeS()
            if (r8 == 0) goto L_0x0172
            r8 = -718965712(0xffffffffd5257430, float:-1.13699025E13)
            r15.ExS(r8)
            java.lang.String r14 = r10.A0X
            boolean r9 = r9.A03
            r8 = 392455581(0x1764659d, float:7.3799027E-25)
            boolean r13 = X.C51974G9v.A1X(r15, r8, r1)
            java.lang.Object r8 = r15.ECw()
            if (r13 != 0) goto L_0x0143
            java.lang.Object r13 = X.AnonymousClass5XT.A00
            if (r8 != r13) goto L_0x014d
        L_0x0143:
            r13 = 41
            X.MPC r8 = new X.MPC
            r8.<init>(r4, r13)
            r15.FLL(r8)
        L_0x014d:
            X.0sP r21 = X.C51965G9l.A0z(r0, r8)
            float r8 = r10.A00()
            androidx.compose.ui.Modifier r8 = X.C54739HQw.A00(r11, r8, r2)
            androidx.compose.ui.Modifier r18 = X.C51968G9o.A0P(r8, r12)
            r23 = 384(0x180, float:5.38E-43)
            r24 = 96
            r17 = r15
            r19 = r14
            r20 = r16
            r22 = r2
            r25 = r9
            r26 = r6
            X.I3E.A01(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x00de
        L_0x0172:
            r6 = -718492683(0xffffffffd52cabf5, float:-1.18659094E13)
            r15.ExS(r6)
            com.instagram.common.typedurl.ImageUrl r6 = r9.A01
            float r8 = r10.A00()
            goto L_0x018d
        L_0x017f:
            r6 = -719149387(0xffffffffd522a6b5, float:-1.11773053E13)
            r15.ExS(r6)
            java.lang.Object r6 = r9.A02
            com.instagram.common.typedurl.ImageUrl r6 = (com.instagram.common.typedurl.ImageUrl) r6
            float r8 = r8.A0l()
        L_0x018d:
            X.C56357Hx8.A01(r15, r6, r8, r2)
            goto L_0x00de
        L_0x0192:
            boolean r8 = X.C53563GqZ.A00(r6, r9)
            if (r8 == 0) goto L_0x01b9
            r8 = 392469048(0x17649a38, float:7.3865425E-25)
            r15.ExS(r8)
            X.GqZ r9 = (X.C53563GqZ) r9
            java.lang.Object r10 = r9.A02
            com.instagram.music.common.model.AudioOverlayTrack r10 = (com.instagram.music.common.model.AudioOverlayTrack) r10
            java.lang.Object r8 = r9.A01
            java.util.List r8 = (java.util.List) r8
            r18 = 384(0x180, float:5.38E-43)
            r19 = 8
            r16 = r10
            r17 = r8
            r20 = r6
            r21 = r2
            X.C56358Hx9.A01(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x00e1
        L_0x01b9:
            boolean r6 = r9 instanceof X.C53561GqX
            if (r6 == 0) goto L_0x01ce
            r6 = 392472229(0x1764a6a5, float:7.388111E-25)
            r15.ExS(r6)
            X.GqX r9 = (X.C53561GqX) r9
            java.lang.String r8 = r9.A01
            com.instagram.model.mediasize.GifUrlImpl r6 = r9.A00
            X.C55195Hdl.A00(r15, r6, r8, r2)
            goto L_0x00e1
        L_0x01ce:
            r6 = -718124527(0xffffffffd5324a11, float:-1.22519489E13)
            r15.ExS(r6)
            goto L_0x00e1
        L_0x01d6:
            r1 = r3
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5B.A03(X.5Wy, X.GhK, int):void");
    }

    public static final void A02(C286575Wy r28, WallPostItem wallPostItem, 0sP r30, float f, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        boolean z3 = z2;
        boolean z4 = z;
        WallPostItem wallPostItem2 = wallPostItem;
        0qQ.A0B(wallPostItem2, 0);
        C286575Wy r4 = r28;
        r4.ExV(1910908436);
        int i5 = i2;
        int i6 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r4, wallPostItem2) | i;
        } else {
            i3 = i6;
        }
        float f2 = f;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A00(r4, f2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0a(r4, z4);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i3 |= G9t.A0b(r4, z3);
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i6 & 24576) == 0) {
            i3 |= G9t.A0I(r4, r30);
        }
        if ((i3 & 9363) != 9362 || !r4.Bwn()) {
            z4 = C51966G9m.A1Q(i7, z4);
            z3 = C51966G9m.A1Q(i8, z3);
            C60340gF r10 = null;
            if (i9 != 0) {
                r30 = null;
            }
            if (0fL.A02()) {
                0fL.A01(-1163698470, "com.instagram.wonderwall.ui.compose.components.WallPostAttachmentPreview (WallAttachment.kt:58)");
            }
            boolean z5 = !(wallPostItem2 instanceof WallTextPostItem);
            WallPostInfo BeB = wallPostItem2.BeB();
            boolean A01 = BeB.A01();
            boolean A1Y = C51967G9n.A1Y(r4, BeB.A06, -791855496);
            Object ECw = r4.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = G9t.A0o(r4, (Object) null);
            }
            C284945Oz r6 = (C284945Oz) ECw;
            C286565Wx A0H = C51965G9l.A0H(r4, false);
            C285245Qk r8 = Modifier.A00;
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r4);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r4, r8);
            C51973G9u.A0y(r4, A0H);
            C51971G9r.A12(r4, A0a, A04);
            0sL r12 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r4, A00)) {
                C51971G9r.A13(r4, r12, A00);
            }
            C51965G9l.A18(r4, A012);
            C289515dj r122 = C289515dj.A00;
            boolean z6 = wallPostItem2 instanceof WallMediaPostItem;
            if (z6) {
                r4.ExS(1710666868);
                if (!A01) {
                    1Xj r16 = ((WallMediaPostItem) wallPostItem2).A01;
                    if (r16.CeS() && z4) {
                        r4.ExS(1710730232);
                        I3E.A00(r4, (C284945Oz) null, C51968G9o.A0P(C54739HQw.A00(C51966G9m.A0T(r8), r16.A0l(), false), 12.0f), r16, (String) null, 0, 384, 248, true, false, false);
                        C286565Wx.A0L(A0H, false);
                    }
                }
                r4.ExS(1711068318);
                Bitmap bitmap = (Bitmap) r6.getValue();
                r4.ExS(-83350663);
                if (bitmap != null) {
                    C56357Hx8.A00(bitmap, r4, ((WallMediaPostItem) wallPostItem2).A01.A0l(), 0);
                    r10 = C60340gF.A00;
                }
                C286565Wx.A0L(A0H, false);
                if (r10 == null) {
                    1Xj r102 = ((WallMediaPostItem) wallPostItem2).A01;
                    C56357Hx8.A01(r4, r102.A1Q(), r102.A0l(), 0);
                }
                C286565Wx.A0L(A0H, false);
            } else if (wallPostItem2 instanceof WallMusicPostItem) {
                r4.ExS(-83342590);
                WallMusicPostItem wallMusicPostItem = (WallMusicPostItem) wallPostItem2;
                C56358Hx9.A01(r4, wallMusicPostItem.A00, wallMusicPostItem.A02, ((i3 >> 3) & 896) | 3072, 0, z3, true);
            } else if (wallPostItem2 instanceof WallGifPostItem) {
                r4.ExS(-83338318);
                WallGifPostItem wallGifPostItem = (WallGifPostItem) wallPostItem2;
                C55195Hdl.A00(r4, wallGifPostItem.A00, wallGifPostItem.A02, 0);
            } else if (wallPostItem2 instanceof WallRepostItem) {
                r4.ExS(-83335565);
                C55198Hdo.A00(r4, ((WallRepostItem) wallPostItem2).A01, r30, (i3 >> 9) & 112, 0);
            } else {
                r4.ExS(-83333252);
            }
            C286565Wx.A0L(A0H, false);
            r4.ExS(-83332450);
            if (z5) {
                if (z6) {
                    boolean CeS = ((WallMediaPostItem) wallPostItem2).A01.CeS();
                    i4 = R.drawable.instagram_photo_pano_outline_24;
                    if (CeS) {
                        i4 = R.drawable.instagram_reels_pano_outline_24;
                    }
                } else if (wallPostItem2 instanceof WallMusicPostItem) {
                    i4 = R.drawable.instagram_music_pano_outline_24;
                } else {
                    boolean z7 = wallPostItem2 instanceof WallGifPostItem;
                    i4 = R.drawable.instagram_text_post_pano_outline_24;
                    if (z7) {
                        i4 = R.drawable.instagram_gif_pano_outline_24;
                    }
                }
                C288165bT.A08(r4, C56164Htt.A01(r122.AAz(C287215Zl.A0D, C287205Zk.A03(r8)), C59049J4i.A00), C287975bA.A00(r4, i4, 0), C304346Dc.A00(r4, 2131965980), C51966G9m.A0E(r4));
            }
            C286565Wx.A0L(A0H, false);
            r4.ASN();
            r4.ExS(-791808324);
            if (z5) {
                G9w.A15(r4, r8, f2);
            }
            C286565Wx.A0L(A0H, false);
            A01(r4, r6, wallPostItem2, i3 & 14);
            if (0fL.A02()) {
                0fL.A00(838230591);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59191J9v(wallPostItem2, r30, f2, i6, i5, 0, z3, z4);
        }
    }
}
