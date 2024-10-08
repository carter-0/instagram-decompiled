package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9W6  reason: invalid class name */
public final class AnonymousClass9W6 implements C344737sL {
    public int A00;
    public AnonymousClass9WC A01;
    public C367508qr A02 = new C367508qr(0, 0);
    public final Context A03;
    public final C344407ro A04;
    public final UserSession A05;
    public final HashMap A06 = AnonymousClass7TE.A1E();
    public final C366048o6 A07;

    public final void ACn(C345897uG r1) {
    }

    public final void CMa(C344567s4 r1) {
    }

    public final C345137sz EEw(C345137sz r8, C345097sv r9, C344697sH r10, Long l) {
        AnonymousClass7TF.A1B(r8, 0, r10);
        if (l != null) {
            int longValue = (int) (l.longValue() / 1000000);
            AnonymousClass9WC r1 = this.A01;
            if (r1 != null) {
                int i = this.A00;
                r1.A01 = longValue;
                r1.A00 = i;
            }
            0qQ.A0F("videoRenderOverlayController");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass9WC r0 = this.A01;
        if (r0 != null) {
            List list = r0.A0G;
            if (list != null) {
                int size = list.size();
                int i2 = 0;
                while (i2 < size) {
                    AnonymousClass9WC r12 = this.A01;
                    if (r12 != null) {
                        C367508qr r02 = this.A02;
                        AnonymousClass9WD A002 = r12.A00(r02, r02, i2);
                        if (A002 != null) {
                            A00(i2);
                            C366048o6 r13 = this.A07;
                            r13.A04 = false;
                            r8 = r13.EEw(A002.A05, (C345097sv) null, r10, l);
                            AnonymousClass9WC r03 = this.A01;
                            if (r03 != null) {
                                r03.A01(i2);
                            }
                        }
                        i2++;
                    }
                }
            }
            return r8;
        }
        0qQ.A0F("videoRenderOverlayController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EEx(C344697sH r13, Long l) {
        int size;
        0qQ.A0B(r13, 0);
        if (l != null) {
            int longValue = (int) (l.longValue() / 1000000);
            AnonymousClass9WC r1 = this.A01;
            if (r1 != null) {
                int i = this.A00;
                r1.A01 = longValue;
                r1.A00 = i;
            }
            0qQ.A0F("videoRenderOverlayController");
            throw AnonymousClass00P.createAndThrow();
        }
        C344407ro r7 = this.A04;
        C344687sG r9 = new C344687sG(r7, (C344037rD) null, ((C344687sG) r13).A05);
        r9.A8c((C345097sv) r13.B9R(0).get(0), 0);
        AnonymousClass9WC r0 = this.A01;
        if (r0 != null) {
            List list = r0.A0G;
            if (list != null && list.size() - 1 >= 0) {
                int i2 = 0;
                while (true) {
                    AnonymousClass9WC r12 = this.A01;
                    if (r12 == null) {
                        break;
                    }
                    C367508qr r02 = this.A02;
                    AnonymousClass9WD A002 = r12.A00(r02, r02, i2);
                    if (A002 != null) {
                        A00(i2);
                        HashMap hashMap = this.A06;
                        C346277uu r14 = (C346277uu) hashMap.get(A002);
                        if (r14 == null) {
                            r14 = new C346277uu(r7, A002, 182.A06(0Tu.A05, this.A05, 2342173317231886902L));
                            hashMap.put(A002, r14);
                        }
                        r9.EZt(r14, 0);
                        C366048o6 r03 = this.A07;
                        r03.A04 = false;
                        r03.EEx(r9, l);
                        AnonymousClass9WC r04 = this.A01;
                        if (r04 == null) {
                            break;
                        }
                        r04.A01(i2);
                    }
                    if (i2 != size) {
                        i2++;
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F("videoRenderOverlayController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FMh(int i, Object obj) {
        0qQ.A0B(obj, 1);
    }

    public final void detach() {
        this.A07.detach();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(int r13) {
        /*
            r12 = this;
            X.9WC r2 = r12.A01
            java.lang.String r6 = "videoRenderOverlayController"
            if (r2 == 0) goto L_0x01fd
            java.util.List r4 = r2.A0G
            r4.getClass()
            java.lang.Object r0 = r4.get(r13)
            X.5Eo r0 = (X.C282745Eo) r0
            X.5Er r0 = r0.A03
            X.5Er r9 = X.C282775Er.A09
            if (r0 != r9) goto L_0x01df
            X.A91 r3 = r2.A0E
            java.lang.Object r0 = r4.get(r13)
            X.5Eo r0 = (X.C282745Eo) r0
            android.graphics.drawable.Drawable r0 = r3.A00(r0)
            X.9X8 r0 = (X.AnonymousClass9X8) r0
            X.9Hy r5 = r0.A03
            float r0 = r5.A00
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            float r0 = r5.A02
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            float r0 = r5.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            float r0 = r5.A03
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01df
        L_0x0040:
            java.lang.Object r0 = r4.get(r13)
            X.5Eo r0 = (X.C282745Eo) r0
            X.5Er r1 = r0.A03
            r0 = 0
            if (r1 != r9) goto L_0x004c
            r0 = 1
        L_0x004c:
            X.02V.A05(r0)
            java.lang.Object r0 = r4.get(r13)
            X.5Eo r0 = (X.C282745Eo) r0
            android.graphics.drawable.Drawable r0 = r3.A00(r0)
            X.9X8 r0 = (X.AnonymousClass9X8) r0
            X.9Hy r4 = r0.A03
            X.0eM r3 = r2.A0J
            java.lang.Object r0 = r3.getValue()
            X.8uk r0 = (X.C369428uk) r0
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r2 = r0.A00
            float r1 = r4.A02
            java.lang.String r0 = "topLeftRadius"
            r2.A00(r0, r1)
            float r1 = r4.A03
            java.lang.String r0 = "topRightRadius"
            r2.A00(r0, r1)
            float r1 = r4.A00
            java.lang.String r0 = "bottomLeftRadius"
            r2.A00(r0, r1)
            float r1 = r4.A01
            java.lang.String r0 = "bottomRightRadius"
            r2.A00(r0, r1)
        L_0x0083:
            java.lang.Object r5 = r3.getValue()
            X.8pF r5 = (X.C366548pF) r5
            X.0qQ.A07(r5)
            X.9WC r3 = r12.A01
            if (r3 == 0) goto L_0x01fd
            X.8qr r6 = r12.A02
            java.util.List r7 = r3.A0G
            r7.getClass()
            java.lang.Object r2 = r7.get(r13)
            X.5Eq r1 = r3.A0D
            int r0 = r3.A01
            r1.A0C = r0
            java.util.Map r0 = r3.A0H
            java.lang.Object r0 = r0.get(r2)
            java.util.NavigableSet r0 = (java.util.NavigableSet) r0
            if (r0 == 0) goto L_0x01f5
            java.lang.Object r10 = r0.floor(r1)
            X.5Eq r10 = (X.C282765Eq) r10
            if (r10 == 0) goto L_0x01f5
            android.util.SparseArray r4 = r3.A0B
            java.lang.Object r8 = r4.get(r13)
            X.B3M r8 = (X.B3M) r8
            if (r8 == 0) goto L_0x0139
            android.util.SparseArray r2 = r3.A0A
            java.lang.Object r11 = r2.get(r13)
            X.5Eq r11 = (X.C282765Eq) r11
            if (r11 == 0) goto L_0x0136
            float r1 = r10.A0A
            float r0 = r11.A0A
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
            float r1 = r10.A02
            float r0 = r11.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
            float r1 = r10.A08
            float r0 = r11.A08
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
            float r1 = r10.A07
            float r0 = r11.A07
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
            float r1 = r10.A00
            float r0 = r11.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
            float r1 = r10.A01
            float r0 = r11.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
            float r1 = r10.A03
            float r0 = r11.A03
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
            float r1 = r10.A05
            float r0 = r11.A05
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
            float r1 = r10.A04
            float r0 = r11.A04
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
            float r1 = r10.A06
            float r0 = r11.A06
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
            float r1 = r10.A09
            float r0 = r11.A09
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0136
        L_0x011f:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r1 = r5.B5t()
            float[] r0 = r8.CDl()
            X.C366728pZ.A00(r1, r0)
            float[] r0 = r8.C5o()
            X.C366728pZ.A01(r1, r0)
            X.8o6 r0 = r12.A07
            r0.A03 = r5
            return
        L_0x0136:
            r2.put(r13, r10)
        L_0x0139:
            java.lang.Object r0 = r7.get(r13)
            X.5Eo r0 = (X.C282745Eo) r0
            X.5Er r0 = r0.A03
            if (r0 != r9) goto L_0x01b6
            X.A91 r2 = r3.A0E
            java.lang.Object r0 = r7.get(r13)
            X.5Eo r0 = (X.C282745Eo) r0
            android.graphics.drawable.Drawable r0 = r2.A00(r0)
            X.9X8 r0 = (X.AnonymousClass9X8) r0
            X.9sL r1 = r0.A04
            X.9sL r8 = X.C391099sL.HORIZONTAL
            if (r1 == r8) goto L_0x015b
            X.9sL r0 = X.C391099sL.VERTICAL
            if (r1 != r0) goto L_0x01b6
        L_0x015b:
            java.lang.Object r0 = r7.get(r13)
            X.5Eo r0 = (X.C282745Eo) r0
            android.graphics.drawable.Drawable r0 = r2.A00(r0)
            X.9X8 r0 = (X.AnonymousClass9X8) r0
            X.9sL r7 = r0.A04
            com.instagram.common.gallery.Medium r0 = r0.A0B
            java.lang.String r1 = r0.A0X
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            android.media.MediaMetadataRetriever r3 = new android.media.MediaMetadataRetriever
            r3.<init>()
            r3.setDataSource(r1)
            r0 = 18
            java.lang.String r0 = r3.extractMetadata(r0)
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x01ef
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 19
            java.lang.String r0 = r3.extractMetadata(r0)
            if (r0 == 0) goto L_0x01e9
            int r0 = java.lang.Integer.parseInt(r0)
            r3.release()
            float r3 = (float) r1
            float r0 = (float) r0
            float r3 = r3 / r0
            if (r7 != r8) goto L_0x01af
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
        L_0x01a1:
            int r1 = r6.A01
            int r0 = r6.A00
            X.ARJ r8 = new X.ARJ
            r8.<init>(r2, r3, r1, r0)
        L_0x01aa:
            r4.put(r13, r8)
            goto L_0x011f
        L_0x01af:
            X.9sL r0 = X.C391099sL.VERTICAL
            if (r7 != r0) goto L_0x01e3
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x01a1
        L_0x01b6:
            com.facebook.common.math.matrix.Matrix4 r2 = new com.facebook.common.math.matrix.Matrix4
            r2.<init>()
            X.ABR.A00(r6, r6, r2, r10)
            java.lang.Object r0 = r7.get(r13)
            X.5Eo r0 = (X.C282745Eo) r0
            X.5Er r0 = r0.A03
            if (r0 != r9) goto L_0x01d9
            X.A91 r1 = r3.A0E
            java.lang.Object r0 = r7.get(r13)
            X.5Eo r0 = (X.C282745Eo) r0
            android.graphics.drawable.Drawable r0 = r1.A00(r0)
            X.9X8 r0 = (X.AnonymousClass9X8) r0
            X.ABR.A01(r6, r2, r0)
        L_0x01d9:
            X.9WE r8 = new X.9WE
            r8.<init>(r2, r3)
            goto L_0x01aa
        L_0x01df:
            X.0eM r3 = r2.A0I
            goto L_0x0083
        L_0x01e3:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x01e9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x01ef:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x01f5:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01fd:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9W6.A00(int):void");
    }

    public static void A01(C344477rv r7, AnonymousClass3Q2 r8, AnonymousClass9W6 r9, List list) {
        ClipInfo clipInfo = r8.A1N;
        int AYr = r7.AYr();
        r9.A01 = new AnonymousClass9WC(r9.A03, r9.A05, r8.A2h, list, AYr);
        r9.A00 = clipInfo.A05 - clipInfo.A07;
    }

    public final int AlC() {
        return 0;
    }

    public final /* synthetic */ int Avq() {
        return 0;
    }

    public final boolean CKm() {
        return true;
    }

    public final /* synthetic */ boolean Cag() {
        return false;
    }

    public final void FLA(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.A02 = new C367508qr(i4, i5);
        this.A07.FLA(i, i2, i3, z, i4, i5);
    }

    public final void release() {
        C39801A9w a9w;
        AnonymousClass9WC r6 = this.A01;
        if (r6 != null) {
            C349027zT r0 = r6.A02;
            if (r0 != null) {
                C349047zV r02 = r0.A00;
                if (r02 != null) {
                    r02.cleanup();
                }
                r6.A02 = null;
            }
            if (r6.A05) {
                for (C282775Er r2 : C282775Er.values()) {
                    int ordinal = r2.ordinal();
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                        AnonymousClass9WB r03 = r6.A03;
                        r03.getClass();
                        C41823B2e A002 = r03.A00(r2);
                        if (A002 != null) {
                            A002.cleanup();
                        }
                    } else if (ordinal == 4 && (a9w = r6.A04) != null) {
                        a9w.A00();
                    }
                }
                r6.A0E.A00.clear();
            }
        }
    }

    public AnonymousClass9W6(Context context, C344407ro r4, C366048o6 r5, UserSession userSession) {
        this.A07 = r5;
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = r4;
    }
}
