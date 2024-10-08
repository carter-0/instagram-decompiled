package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Picture;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import com.instagram.genai.imageutils.MaskUtilsKt;

/* renamed from: X.Iwt  reason: case insensitive filesystem */
public final class C58746Iwt extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58746Iwt(Object obj, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = obj;
    }

    /* JADX INFO: finally extract failed */
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C268104cl r15;
        C267974cY r3;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                ((C268104cl) obj).A0B((C267974cY) this.A03, AnonymousClass5SD.A01, this.A01, this.A02);
                break;
            case 1:
                r15 = (C268104cl) obj;
                r3 = (C267974cY) this.A03;
                i = this.A01;
                i2 = this.A02;
                break;
            case 2:
                throw AnonymousClass7TE.A11("setName");
            case 3:
                r15 = (C268104cl) obj;
                r3 = (C267974cY) this.A03;
                i = -this.A01;
                i2 = -this.A02;
                break;
            case 4:
                C254523sc r152 = (C254523sc) obj;
                0qQ.A0B(r152, 0);
                C233822wX.A0Z(r152, ((C267324bN) this.A03).A06(), this.A01);
                r152.A3C = Integer.valueOf(this.A02);
                break;
            case 5:
                AnonymousClass5Q4 r153 = (AnonymousClass5Q4) obj;
                0qQ.A0B(r153, 0);
                Picture picture = (Picture) this.A03;
                Canvas beginRecording = picture.beginRecording(this.A02, this.A01);
                0qQ.A07(beginRecording);
                Canvas canvas = AnonymousClass5R4.A00;
                AnonymousClass5R3 r12 = new AnonymousClass5R3();
                r12.A00 = beginRecording;
                AnonymousClass5Q8 layoutDirection = r153.getLayoutDirection();
                long Bwg = r153.Bwg();
                AnonymousClass5QD Ayw = r153.Ayw();
                AnonymousClass5QC r9 = (AnonymousClass5QC) Ayw;
                AnonymousClass5QB r13 = r9.A02.A02;
                C268024cd r8 = r13.A02;
                AnonymousClass5Q8 r7 = r13.A03;
                AnonymousClass5QA r6 = r13.A01;
                long j = r13.A00;
                GraphicsLayer graphicsLayer = r9.A00;
                Ayw.EUC(r153);
                Ayw.Ebv(layoutDirection);
                Ayw.ER3(r12);
                Ayw.ElR(Bwg);
                r9.A00 = null;
                r12.EJt();
                try {
                    r153.AQW();
                    C51972G9s.A12(r12, r6, Ayw, r8, r7);
                    Ayw.ElR(j);
                    r9.A00 = graphicsLayer;
                    picture.endRecording();
                    AnonymousClass5R4.A00(r13.A01).drawPicture(picture);
                    break;
                } catch (Throwable th) {
                    C51972G9s.A12(r12, r6, Ayw, r8, r7);
                    Ayw.ElR(j);
                    r9.A00 = graphicsLayer;
                    throw th;
                }
            case 6:
                int A0M = AnonymousClass7TE.A0M(obj);
                for (int i3 = 0; i3 < this.A01; i3++) {
                    int i4 = (this.A02 * i3) + A0M;
                    int[] iArr = (int[]) this.A03;
                    int i5 = 0;
                    if (iArr[i4] == MaskUtilsKt.A01) {
                        i5 = -1;
                    }
                    iArr[i4] = i5;
                }
                break;
            default:
                int A0M2 = AnonymousClass7TE.A0M(obj);
                for (int i6 = 0; i6 < this.A01; i6++) {
                    int i7 = (this.A02 * i6) + A0M2;
                    int[] iArr2 = (int[]) this.A03;
                    int i8 = (iArr2[i7] >> 16) & 255;
                    int i9 = MaskUtilsKt.A00;
                    iArr2[i7] = Color.argb(i8, 0, 0, 0);
                }
                break;
        }
        r15.A05(r3, 0.0f, i, i2);
        return C60340gF.A00;
    }
}
