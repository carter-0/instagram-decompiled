package X;

import instagram.features.stories.fragment.ReelMoreOptionsFragment;

/* renamed from: X.LzG  reason: case insensitive filesystem */
public final class C65762LzG implements C74369Ptj {
    public final /* synthetic */ ReelMoreOptionsFragment A00;

    public C65762LzG(ReelMoreOptionsFragment reelMoreOptionsFragment) {
        this.A00 = reelMoreOptionsFragment;
    }

    public final void onTextChanged(String str) {
        ReelMoreOptionsFragment reelMoreOptionsFragment = this.A00;
        String str2 = reelMoreOptionsFragment.A03.A0C;
        if (str2 == null) {
            str2 = "";
        }
        if (!str.equals(str2)) {
            ReelMoreOptionsFragment.A0B(reelMoreOptionsFragment);
        }
    }
}
