package X;

import com.instagram.user.model.User;

public final class E9G extends 2Ru implements C231272rL {
    public C231642s0 A00;
    public C322516vx A01;
    public C322526vy A02;
    public boolean A03;

    public final CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }

    public final boolean isEnabled(int i) {
        return false;
    }

    public final void A00(User user) {
        if (user != null) {
            clear();
            C322516vx r2 = this.A01;
            r2.A0E = user;
            r2.A0K = false;
            r2.A00 = 0;
            r2.A08 = null;
            r2.A0D = null;
            r2.A0C = null;
            r2.A04 = null;
            r2.A01 = null;
            r2.A0B = null;
            r2.A0J = false;
            r2.A0H = null;
            r2.A0G = null;
            r2.A0F = null;
            r2.A07 = null;
            r2.A06 = null;
            r2.A09 = null;
            r2.A02 = null;
            r2.A0M = false;
            r2.A0I = false;
            r2.A0L = false;
            r2.A03 = null;
            addModel(r2, this.A02, this.A00);
            if (this.A03) {
                notifyDataSetChangedSmart();
            } else {
                updateListView();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }
}
