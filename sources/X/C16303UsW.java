package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.text.fittingtextview.FittingTextView;

/* renamed from: X.UsW  reason: case insensitive filesystem */
public final class C16303UsW extends W7f {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final /* synthetic */ C19339WUv A05;

    public C16303UsW(Context context, C19339WUv wUv) {
        this.A05 = wUv;
        Resources resources = context.getResources();
        this.A04 = resources.getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        this.A03 = AnonymousClass7TE.A0G(resources);
        this.A02 = resources.getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
        this.A01 = AnonymousClass7TE.A0E(resources);
    }

    public final void afterTextChanged(Editable editable) {
        EditText editText;
        int i;
        C19339WUv wUv = this.A05;
        EditText editText2 = wUv.A07;
        String str = "stickerTitleView";
        if (editText2 != null) {
            int lineCount = editText2.getLineCount();
            if (lineCount != this.A00) {
                EditText editText3 = wUv.A07;
                if (lineCount == 2) {
                    if (editText3 != null) {
                        0nA.A0c(editText3, this.A02);
                        editText = wUv.A07;
                        if (editText != null) {
                            i = this.A01;
                        }
                    }
                } else if (editText3 != null) {
                    0nA.A0c(editText3, this.A04);
                    editText = wUv.A07;
                    if (editText != null) {
                        i = this.A03;
                    }
                }
                0nA.A0X(editText, i);
                this.A00 = lineCount;
            }
            boolean A042 = C19339WUv.A04(wUv);
            FittingTextView fittingTextView = wUv.A0O;
            fittingTextView.setEnabled(A042);
            C18708VyZ.A01(fittingTextView, A042);
            C19339WUv.A02(wUv, true);
            TextView textView = wUv.A08;
            if (textView == null) {
                str = "incompleteStickerErrorView";
            } else {
                C315596kB.A08(new View[]{textView}, true);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
