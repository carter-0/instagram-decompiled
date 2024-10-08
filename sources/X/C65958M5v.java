package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* renamed from: X.M5v  reason: case insensitive filesystem */
public final class C65958M5v implements Runnable {
    public final /* synthetic */ C61364K4g A00;
    public final /* synthetic */ IgdsInlineSearchBox A01;

    public C65958M5v(C61364K4g k4g, IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = k4g;
        this.A01 = igdsInlineSearchBox;
    }

    public final void run() {
        C61364K4g k4g = this.A00;
        if (k4g.getActivity() != null && k4g.isAdded()) {
            AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(k4g.requireActivity(), 002.A0C(k4g.getString(2131953460), '.'));
            A0f.A03(this.A01);
            A0f.A01();
            A0f.A0B = true;
            DbU.A1T(A0f);
            C60294Jir A0B = k4g.A0B();
            0xY AR4 = A0B.A0L.A00.AR4();
            AR4.E5T("key_has_seen_avatar_mentions_tooltip_v4", true);
            AR4.apply();
            LHS.A00(A0B.A0I, "Type @ to search friends' avatars");
        }
    }
}
