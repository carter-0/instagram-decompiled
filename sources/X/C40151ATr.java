package X;

import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.common.math.matrix.Matrix4;
import java.util.HashMap;
import java.util.NavigableSet;

/* renamed from: X.ATr  reason: case insensitive filesystem */
public final class C40151ATr implements C344737sL {
    public C367508qr A00 = new C367508qr(0, 0);
    public C39742A7i A01;
    public final C344407ro A02;
    public final C366048o6 A03;
    public final A6G A04;
    public final HashMap A05 = AnonymousClass7TE.A1E();

    public final void ACn(C345897uG r1) {
    }

    public final void CMa(C344567s4 r1) {
    }

    public final /* synthetic */ C345137sz EEw(C345137sz r1, C345097sv r2, C344697sH r3, Long l) {
        return r1;
    }

    public final void FMh(int i, Object obj) {
        0qQ.A0B(obj, 1);
    }

    public final void detach() {
        this.A03.detach();
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

    public final void EEx(C344697sH r25, Long l) {
        C344697sH r1 = r25;
        0qQ.A0B(r1, 0);
        C344407ro r9 = this.A02;
        C344687sG r8 = new C344687sG(r9, (C344037rD) null, ((C344687sG) r1).A05);
        r8.A8c((C345097sv) r1.B9R(0).get(0), 0);
        C39742A7i a7i = this.A01;
        if (a7i != null) {
            int size = a7i.A04.size();
            int i = 0;
            while (i < size) {
                C39742A7i a7i2 = this.A01;
                if (a7i2 != null) {
                    String A19 = AnonymousClass7TE.A19(a7i2.A04, i);
                    A6G a6g = a7i2.A02;
                    0qQ.A0B(A19, 0);
                    try {
                        C365358my A012 = AnonymousClass9S9.A01(a6g.A00, A19, 2, 00p.A0i(AnonymousClass7TF.A0j(A19), ".pkm", false), true);
                        HashMap hashMap = a6g.A02;
                        if (A012 != null) {
                            hashMap.put(A19, A012);
                            Object obj = hashMap.get(A19);
                            if (obj != null) {
                                C365358my r2 = (C365358my) obj;
                                SparseArray sparseArray = a7i2.A00;
                                AnonymousClass9WD r15 = (AnonymousClass9WD) sparseArray.get(i);
                                if (r15 == null) {
                                    r15 = new AnonymousClass9WD(new C345047sq());
                                    sparseArray.put(i, r15);
                                }
                                r15.A04 = false;
                                int width = r2.getWidth();
                                int height = r2.getHeight();
                                r15.FKc(width, height, width, height, 0, 0, 0, false);
                                C346337v0 texture = r2.getTexture();
                                r15.A02 = texture;
                                r15.A05.A04 = texture;
                                texture.A00(r15.A01, r15.A00);
                                C346267ut r0 = r15.A03;
                                if (r0 != null) {
                                    r0.DGm();
                                }
                                C39742A7i a7i3 = this.A01;
                                if (a7i3 != null) {
                                    C367538r5 r4 = (C367538r5) a7i3.A06.getValue();
                                    FilterModel filterModel = r4.A00;
                                    C39742A7i a7i4 = this.A01;
                                    if (a7i4 != null) {
                                        C367508qr r12 = this.A00;
                                        C282765Eq r22 = (C282765Eq) ((NavigableSet) a7i4.A05.get(i)).floor(a7i4.A03);
                                        SparseArray sparseArray2 = a7i4.A01;
                                        Matrix4 matrix4 = (Matrix4) sparseArray2.get(i);
                                        if (matrix4 == null) {
                                            matrix4 = new Matrix4();
                                            sparseArray2.put(i, matrix4);
                                            0qQ.A0A(r22);
                                            ABR.A00(r12, r12, matrix4, r22);
                                        }
                                        C366728pZ.A00(filterModel, matrix4.A01);
                                        C366048o6 r23 = this.A03;
                                        r23.A03 = r4;
                                        HashMap hashMap2 = this.A05;
                                        C346277uu r02 = (C346277uu) hashMap2.get(r15);
                                        if (r02 == null) {
                                            r02 = new C346277uu(r9, r15, true);
                                            hashMap2.put(r15, r02);
                                        }
                                        r8.EZt(r02, 0);
                                        r23.A04 = false;
                                        r23.EEx(r8, l);
                                        i++;
                                    }
                                }
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    } catch (Exception e) {
                        27p.A01(a6g.A01).A04.A03();
                        AnonymousClass7TF.A19(0wj.A01.AEf("null_texture", 817894439), "path", A19, e);
                        throw e;
                    }
                }
            }
            return;
        }
        0qQ.A0F("photoRenderOverlayController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FLA(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.A00 = new C367508qr(i4, i5);
        this.A03.FLA(i, i2, i3, z, i4, i5);
    }

    public final void release() {
    }

    public C40151ATr(C344407ro r3, C366048o6 r4, A6G a6g) {
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = a6g;
    }
}
