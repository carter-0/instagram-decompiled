package X;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Q9h  reason: case insensitive filesystem */
public final class C7374Q9h extends FrameLayout implements C13601TdT {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public C8037Qfh A04;
    public boolean A05 = true;
    public final View.OnClickListener A06;

    public C7374Q9h(Context context) {
        super(context, (AttributeSet) null, 0);
        String str;
        View.inflate(context, R.layout.ecp_custom_checkbox, this);
        this.A00 = AnonymousClass7TE.A0b(this, R.id.checkbox_container);
        TextView A0B = DbW.A0B(this, R.id.primary_text);
        this.A02 = A0B;
        if (A0B == null) {
            str = "primaryTextView";
        } else {
            SRn.A02(A0B, RH2.A0s);
            TextView A0B2 = DbW.A0B(this, R.id.secondary_text);
            this.A03 = A0B2;
            if (A0B2 == null) {
                str = "secondaryTextView";
            } else {
                SRn.A02(A0B2, RH2.A14);
                ImageView imageView = (ImageView) AnonymousClass7TE.A0b(this, R.id.image);
                this.A01 = imageView;
                if (imageView == null) {
                    str = "imageView";
                } else {
                    imageView.setBackground(getCheckBoxDrawable());
                    this.A06 = C11496SbJ.A00(this, 1);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void setViewModel(C8037Qfh qfh) {
        boolean booleanValue;
        String str;
        0qQ.A0B(qfh, 0);
        this.A04 = qfh;
        Boolean bool = (Boolean) SRc.A0A(qfh);
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.A05 = booleanValue;
        setEnabled(qfh.A08);
        TextView textView = this.A02;
        if (textView == null) {
            str = "primaryTextView";
        } else {
            Context context = getContext();
            DbT.A18(context, textView, qfh.A01);
            TextView textView2 = this.A03;
            str = "secondaryTextView";
            if (textView2 != null) {
                textView2.setText(qfh.A02);
                textView2.setVisibility(DbW.A01(this.A05 ? 1 : 0));
                ImageView imageView = this.A01;
                if (imageView == null) {
                    str = "imageView";
                } else {
                    int i = -16842912;
                    if (this.A05) {
                        i = 16842912;
                    }
                    imageView.setImageState(new int[]{i}, true);
                    C18674VwX.A01(this, AnonymousClass05K.A0C, context.getString(qfh.A00));
                    View view = this.A00;
                    if (view == null) {
                        str = "containerView";
                    } else {
                        view.setOnClickListener(this.A06);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    private final StateListDrawable getCheckBoxDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        SPB A0A = AnonymousClass2E0.A0A();
        Context context = getContext();
        0qQ.A07(context);
        stateListDrawable.addState(new int[]{16842912}, A0A.A05(context, 23, 9));
        stateListDrawable.addState(new int[]{-16842912}, AnonymousClass2E0.A0A().A05(context, 24, 51));
        return stateListDrawable;
    }

    public void setEnabled(boolean z) {
        setClickable(z);
        float f = 0.3f;
        if (z) {
            f = 1.0f;
        }
        setAlpha(f);
    }
}
