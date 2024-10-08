package X;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.PointF;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.instagram.genai.imageutils.MaskUtilsKt;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class J6Y extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6Y(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A01 = i;
        switch (i3) {
            case 5:
            case 7:
                this.A04 = iArr;
                this.A02 = i2;
                this.A03 = iArr2;
                break;
            default:
                this.A03 = iArr;
                this.A02 = i2;
                this.A04 = iArr2;
                break;
        }
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C296965qw r1;
        1Xj BPf;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C268104cl r15 = (C268104cl) obj2;
                C267974cY[] r7 = (C267974cY[]) this.A03;
                IGH igh = (IGH) this.A04;
                int i = this.A02;
                int i2 = this.A01;
                for (C267974cY r2 : r7) {
                    if (r2 != null) {
                        long AB3 = igh.A00.A01.AB3(AnonymousClass5Q8.Ltr, C289155d7.A00(r2.A01, r2.A00), C289155d7.A00(i, i2));
                        r15.A05(r2, 0.0f, C51965G9l.A04(AB3), C51968G9o.A02(AB3));
                    }
                }
                break;
            case 1:
                C268104cl r152 = (C268104cl) obj2;
                0qQ.A0B(r152, 0);
                C267974cY[] r9 = (C267974cY[]) this.A03;
                int i3 = this.A02;
                int i4 = this.A01;
                Object obj3 = this.A04;
                for (C267974cY r4 : r9) {
                    0qQ.A0C(r4, AnonymousClass000.A00(3646));
                    r152.A09(r4, new C59099J6h(obj3, 29), 0.0f, (i3 - r4.A0H()) / 2, (i4 - r4.A0G()) / 2);
                }
                break;
            case 2:
                C268104cl r153 = (C268104cl) obj2;
                0qQ.A0B(r153, 0);
                float A002 = C51975G9x.A00((AnonymousClass5b4) this.A03);
                int i5 = this.A01;
                int i6 = (int) (A002 * ((float) i5));
                int i7 = this.A02;
                for (C267974cY r22 : (List) this.A04) {
                    r153.A07(r22, (i7 - r22.A01) / 2, ((i5 - r22.A00) / 2) + i6);
                    i6 += i5;
                }
                break;
            case 3:
                AnonymousClass5Q4 r154 = (AnonymousClass5Q4) obj2;
                0qQ.A0B(r154, 0);
                Picture picture = (Picture) this.A03;
                Canvas beginRecording = picture.beginRecording(this.A02, this.A01);
                0qQ.A07(beginRecording);
                Canvas canvas = AnonymousClass5R4.A00;
                AnonymousClass5R3 r13 = new AnonymousClass5R3();
                r13.A00 = beginRecording;
                AnonymousClass5Q8 layoutDirection = r154.getLayoutDirection();
                long Bwg = r154.Bwg();
                AnonymousClass5QD Ayw = r154.Ayw();
                AnonymousClass5QC r10 = (AnonymousClass5QC) Ayw;
                AnonymousClass5QB r0 = r10.A02.A02;
                C268024cd r92 = r0.A02;
                AnonymousClass5Q8 r8 = r0.A03;
                AnonymousClass5QA r72 = r0.A01;
                long j = r0.A00;
                GraphicsLayer graphicsLayer = r10.A00;
                Ayw.EUC(r154);
                Ayw.Ebv(layoutDirection);
                Ayw.ER3(r13);
                Ayw.ElR(Bwg);
                r10.A00 = null;
                r13.EJt();
                try {
                    r154.AQW();
                    C51972G9s.A12(r13, r72, Ayw, r92, r8);
                    Ayw.ElR(j);
                    r10.A00 = graphicsLayer;
                    picture.endRecording();
                    AnonymousClass5R4.A00(r0.A01).drawPicture(picture);
                    ((C241063Ns) this.A04).A0T(C60340gF.A00);
                    break;
                } catch (Throwable th) {
                    C51972G9s.A12(r13, r72, Ayw, r92, r8);
                    Ayw.ElR(j);
                    r10.A00 = graphicsLayer;
                    throw th;
                }
            case 4:
                long j2 = ((C289295dM) obj2).A00;
                long j3 = ((AnonymousClass6FP) ((AnonymousClass6FR) this.A03)).A00;
                int A042 = C51965G9l.A04(j3);
                int A003 = C289005cr.A00(j3);
                if (!(A042 == 0 || A003 == 0)) {
                    float A012 = C289295dM.A01(j2);
                    int i8 = this.A02;
                    float f = (float) i8;
                    float A022 = C289295dM.A02(j2);
                    int i9 = this.A01;
                    float f2 = (float) i9;
                    Point point = new Point(C229632nm.A03(AnonymousClass1GB.A01(A012), 0, A042 - 1), C229632nm.A03(AnonymousClass1GB.A01(A022), 0, A003 - 1));
                    Point point2 = new Point(C229632nm.A03(AnonymousClass1GB.A01((A012 / ((float) A042)) * f), 0, i8 - 1), C229632nm.A03(AnonymousClass1GB.A01((A022 / ((float) A003)) * f2), 0, i9 - 1));
                    C51965G9l.A1W(this.A04, new C61084JwM(18, (Object) new PointF(((float) point2.x) / f, ((float) point2.y) / f2), (Object) point2, (Object) point));
                    break;
                }
            case 5:
                int A0M = AnonymousClass7TE.A0M(obj2);
                for (int i10 = 0; i10 < this.A01; i10++) {
                    int i11 = this.A02;
                    if (((int[]) this.A04)[(i11 * i10) + A0M] != MaskUtilsKt.A00) {
                        int[] iArr = (int[]) this.A03;
                        int i12 = MaskUtilsKt.A01;
                        iArr[(i11 * i10) + A0M] = i12;
                        if (A0M > 1) {
                            iArr[(A0M - 1) + (i11 * i10)] = i12;
                        }
                        if (A0M < i11 - 1) {
                            iArr[A0M + 1 + (i11 * i10)] = i12;
                        }
                    }
                }
                break;
            case 6:
                int A0M2 = AnonymousClass7TE.A0M(obj2);
                int i13 = 0;
                while (true) {
                    int i14 = this.A01;
                    if (i13 >= i14) {
                        break;
                    } else {
                        int i15 = this.A02;
                        if (((int[]) this.A03)[(i15 * i13) + A0M2] != MaskUtilsKt.A00) {
                            int[] iArr2 = (int[]) this.A04;
                            int i16 = MaskUtilsKt.A01;
                            iArr2[(i15 * i13) + A0M2] = i16;
                            if (i13 > 0) {
                                iArr2[((i13 - 1) * i15) + A0M2] = i16;
                            }
                            if (i13 < i14 - 1) {
                                iArr2[((i13 + 1) * i15) + A0M2] = i16;
                            }
                        }
                        i13++;
                    }
                }
            case 7:
                int A0M3 = AnonymousClass7TE.A0M(obj2);
                int i17 = 0;
                while (true) {
                    int i18 = this.A01;
                    if (i17 >= i18) {
                        break;
                    } else {
                        int[] iArr3 = (int[]) this.A04;
                        int i19 = this.A02;
                        int i20 = iArr3[(i19 * i17) + A0M3];
                        int i21 = MaskUtilsKt.A00;
                        if (i20 != i21) {
                            int i22 = -1;
                            while (true) {
                                if (i22 < 2) {
                                    int i23 = -1;
                                    do {
                                        int i24 = i22 + A0M3;
                                        int i25 = i17 + i23;
                                        if (i24 < 0 || i24 >= i19 || i25 < 0 || i25 >= i18 || iArr3[i24 + (i25 * i19)] != i21) {
                                            i23++;
                                        } else {
                                            ((int[]) this.A03)[(i19 * i17) + A0M3] = i21;
                                        }
                                    } while (i23 < 2);
                                    i22++;
                                }
                            }
                        }
                        i17++;
                    }
                }
            case 8:
                N4N n4n = (N4N) this.A04;
                C297005r0 r12 = (C297005r0) this.A03;
                int i26 = this.A02;
                int i27 = this.A01;
                AnonymousClass7TG.A1N(n4n, r12);
                ArrayList A0U = 00k.A0U(n4n.A0H);
                A0U.add(i26, r12);
                1Xj r82 = n4n.A08;
                Integer num = n4n.A0B;
                Map map = n4n.A0I;
                List<C296935qt> list = r12.A02;
                boolean z = false;
                for (C296935qt r14 : list) {
                    if (r14 instanceof C52435GSn) {
                        C52435GSn gSn = (C52435GSn) r14;
                        gSn.A00.A0D(i26);
                        num = Integer.valueOf(i26);
                        r82 = gSn.BPf();
                        z = true;
                    }
                }
                if (!z) {
                    map.remove(Integer.valueOf(i26));
                }
                ArrayList<Object> A1C = AnonymousClass7TE.A1C();
                for (C296935qt r16 : list) {
                    if (!(!(r16 instanceof C296965qw) || (r1 = (C296965qw) r16) == null || (BPf = r1.BPf()) == null)) {
                        C51971G9r.A1M(BPf, A1C);
                    }
                }
                ArrayList A0r = AnonymousClass7TG.A0r(A1C);
                for (Object A1I : A1C) {
                    AnonymousClass7TF.A1I(A1I, Integer.valueOf(i27), A0r);
                }
                return N4N.A00((C15051ULh) null, (C61041Jvf) null, (N3M) null, r82, (OEW) null, (C69628NpA) null, n4n, (Integer) null, num, (String) null, (String) null, (String) null, (String) null, (String) null, 00k.A0a(A0U), 0Yt.A04(n4n.A0J, 0Yt.A08(A0r)), map, 0, 0, 32636670, false, false, false, false, false, false);
            default:
                Product A023 = ((ProductFeedItem) this.A04).A02();
                if (A023 != null) {
                    ((C21003X9a) this.A03).DZg(A023, this.A02, this.A01);
                    break;
                }
                break;
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J6Y(Object obj, int i, Object obj2, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A03 = obj;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = obj2;
    }
}
