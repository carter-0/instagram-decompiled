package X;

import android.app.AlertDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

public abstract class V9Y {
    public static Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        boolean z;
        boolean z2;
        boolean z3;
        Button button;
        Button button2;
        Button button3;
        C307786Rm r7 = r14.A03;
        if (r7 != null) {
            C276544tV r9 = (C276544tV) r15.A03(0);
            0qQ.A0B(r9, 3);
            FragmentActivity A04 = C308206Td.A04(r14);
            boolean z4 = r7.A05;
            int i = 16974394;
            if (z4) {
                i = 16974374;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(A04, i);
            String A0E = r9.A0E();
            if (A0E != null) {
                Context context = builder.getContext();
                int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, AnonymousClass7TF.A0E(context));
                int applyDimension2 = (int) TypedValue.applyDimension(1, 18.0f, AnonymousClass7TF.A0E(context));
                TextView textView = new TextView(context, (AttributeSet) null, 16842817);
                textView.setText(A0E);
                textView.setTypeface(C64361Kj.A00().A05.A00(context, "sans-serif-medium"));
                int i2 = -14277082;
                if (z4) {
                    i2 = -1;
                }
                textView.setTextColor(i2);
                textView.setPadding(applyDimension, applyDimension2, applyDimension, 0);
                builder.setCustomTitle(textView);
            }
            String A0D = r9.A0D();
            if (A0D != null) {
                builder.setMessage(A0D);
            }
            C276544tV A07 = r9.A07(36);
            SparseArray sparseArray = null;
            if (A07 == null) {
                z = false;
            } else {
                String A0K = A07.A0K(46);
                if (A0K != null) {
                    sparseArray = new SparseArray();
                    sparseArray.append(R.id.testing_id_view_tag_key, A0K);
                }
                String str = "";
                String A0K2 = A07.A0K(36);
                if (A0K2 != null) {
                    str = A0K2;
                }
                W5R w5r = new W5R(0, (Object) r7, (Object) A07, (Object) r14);
                A07.A0K(40);
                z = true;
                builder.setPositiveButton(str, w5r);
            }
            C276544tV A072 = r9.A07(38);
            SparseArray sparseArray2 = null;
            if (A072 == null) {
                z2 = false;
            } else {
                String A0K3 = A072.A0K(46);
                if (A0K3 != null) {
                    sparseArray2 = new SparseArray();
                    sparseArray2.append(R.id.testing_id_view_tag_key, A0K3);
                }
                String str2 = "";
                String A0F = A072.A0F();
                if (A0F != null) {
                    str2 = A0F;
                }
                W5R w5r2 = new W5R(0, (Object) r7, (Object) A072, (Object) r14);
                A072.A0K(40);
                z2 = true;
                builder.setNegativeButton(str2, w5r2);
            }
            C276544tV A073 = r9.A07(44);
            SparseArray sparseArray3 = null;
            if (A073 == null) {
                z3 = false;
            } else {
                String A0K4 = A073.A0K(46);
                if (A0K4 != null) {
                    sparseArray3 = new SparseArray();
                    sparseArray3.append(R.id.testing_id_view_tag_key, A0K4);
                }
                String str3 = "";
                String A0F2 = A073.A0F();
                if (A0F2 != null) {
                    str3 = A0F2;
                }
                W5R w5r3 = new W5R(0, (Object) r7, (Object) A073, (Object) r14);
                A073.A0K(40);
                z3 = true;
                builder.setNeutralButton(str3, w5r3);
            }
            AlertDialog create = builder.create();
            AnonymousClass0fN.A00(create);
            if (z && (button3 = create.getButton(-1)) != null) {
                int i3 = -16777216;
                if (z4) {
                    i3 = -1;
                }
                button3.setTextColor(i3);
                if (sparseArray != null) {
                    for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                        int keyAt = sparseArray.keyAt(i4);
                        button3.setTag(keyAt, sparseArray.get(keyAt));
                    }
                }
            }
            if (z2 && (button2 = create.getButton(-2)) != null) {
                int i5 = -16777216;
                if (z4) {
                    i5 = -1;
                }
                button2.setTextColor(i5);
                if (sparseArray2 != null) {
                    for (int i6 = 0; i6 < sparseArray2.size(); i6++) {
                        int keyAt2 = sparseArray2.keyAt(i6);
                        button2.setTag(keyAt2, sparseArray2.get(keyAt2));
                    }
                }
            }
            if (z3 && (button = create.getButton(-3)) != null) {
                int i7 = -16777216;
                if (z4) {
                    i7 = -1;
                }
                button.setTextColor(i7);
                if (sparseArray3 != null) {
                    for (int i8 = 0; i8 < sparseArray3.size(); i8++) {
                        int keyAt3 = sparseArray3.keyAt(i8);
                        button.setTag(keyAt3, sparseArray3.get(keyAt3));
                    }
                }
            }
        }
        return null;
    }
}
