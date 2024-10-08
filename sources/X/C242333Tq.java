package X;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* renamed from: X.3Tq  reason: invalid class name and case insensitive filesystem */
public final class C242333Tq extends C242323Tp {
    public boolean A00 = true;
    public final TextView A01;
    public final C242343Tr A02;

    public final TransformationMethod A00(TransformationMethod transformationMethod) {
        if (!this.A00) {
            TransformationMethod transformationMethod2 = transformationMethod;
            if (transformationMethod instanceof AnonymousClass3U8) {
                return ((AnonymousClass3U8) transformationMethod2).A00;
            }
            return transformationMethod2;
        } else if ((transformationMethod instanceof AnonymousClass3U8) || (transformationMethod instanceof PasswordTransformationMethod)) {
            return transformationMethod;
        } else {
            return new AnonymousClass3U8(transformationMethod);
        }
    }

    public final void A02(boolean z) {
        this.A00 = z;
        TextView textView = this.A01;
        textView.setTransformationMethod(A00(textView.getTransformationMethod()));
        textView.setFilters(A04(textView.getFilters()));
    }

    public final InputFilter[] A04(InputFilter[] inputFilterArr) {
        int length;
        if (!this.A00) {
            SparseArray sparseArray = new SparseArray(1);
            int i = 0;
            while (true) {
                length = inputFilterArr.length;
                if (i >= length) {
                    break;
                }
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C242343Tr) {
                    sparseArray.put(i, inputFilter);
                }
                i++;
            }
            if (sparseArray.size() != 0) {
                InputFilter[] inputFilterArr2 = new InputFilter[(length - sparseArray.size())];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
        } else {
            int length2 = inputFilterArr.length;
            int i4 = 0;
            while (i4 < length2) {
                if (inputFilterArr[i4] != this.A02) {
                    i4++;
                }
            }
            InputFilter[] inputFilterArr3 = new InputFilter[(length2 + 1)];
            System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
            inputFilterArr3[length2] = this.A02;
            return inputFilterArr3;
        }
        return inputFilterArr;
    }

    public C242333Tq(TextView textView) {
        this.A01 = textView;
        this.A02 = new C242343Tr(textView);
    }
}
