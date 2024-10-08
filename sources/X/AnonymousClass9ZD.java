package X;

import java.util.Arrays;

/* renamed from: X.9ZD  reason: invalid class name */
public final class AnonymousClass9ZD extends C21289XSu {
    public Float A00;
    public String A01;
    public float[] A02;
    public final C348097xs A03;

    public AnonymousClass9ZD(C348097xs r2, Float f, String str, float[] fArr) {
        0qQ.A0B(r2, 1);
        this.A03 = r2;
        this.A01 = str;
        this.A00 = f;
        this.A02 = fArr;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (0qQ.A0K(cls2, cls)) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.aiplatform.processors.scenerecognizer.model.SceneRecognizerOutputModel");
                AnonymousClass9ZD r5 = (AnonymousClass9ZD) obj;
                if (this.A03 == r5.A03 && 0qQ.A0K(this.A01, r5.A01) && 0qQ.A0J(this.A00, r5.A00)) {
                    float[] fArr = this.A02;
                    float[] fArr2 = r5.A02;
                    if (fArr != null) {
                        if (fArr2 == null || !Arrays.equals(fArr, fArr2)) {
                            return false;
                        }
                    } else if (fArr2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int A0K = AnonymousClass7TE.A0K(this.A03);
        String str = this.A01;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (A0K + i) * 31;
        Float f = this.A00;
        if (f != null) {
            i2 = f.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        float[] fArr = this.A02;
        if (fArr != null) {
            i3 = Arrays.hashCode(fArr);
        }
        return i5 + i3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SceneRecognizerOutputModel(outputType=");
        A1A.append(this.A03);
        A1A.append(", concept=");
        A1A.append(this.A01);
        A1A.append(", score=");
        A1A.append(this.A00);
        A1A.append(", embeddings=");
        A1A.append(Arrays.toString(this.A02));
        return AnonymousClass7TG.A0p(A1A);
    }

    public AnonymousClass9ZD() {
        this(C348097xs.CONCEPT_SCORES, (Float) null, (String) null, (float[]) null);
    }
}
