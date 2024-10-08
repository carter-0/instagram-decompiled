package X;

import com.instagram.android.R;

/* renamed from: X.Qcg  reason: case insensitive filesystem */
public final class C7910Qcg extends C68376NEc {
    public final CharSequence A01() {
        CharSequence charSequence = Pxj.A0J(requireContext(), R.attr.id_permissions_body_text).string;
        if (charSequence != null && charSequence.length() > 0) {
            return charSequence;
        }
        CharSequence text = getText(R.string.f0nameremoved);
        0qQ.A0A(text);
        return text;
    }
}
