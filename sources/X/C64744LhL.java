package X;

import java.util.List;

/* renamed from: X.LhL  reason: case insensitive filesystem */
public final class C64744LhL implements C232262tL {
    public List A00;
    public boolean A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "upcoming_events_model_key";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        List list;
        C64744LhL lhL = (C64744LhL) obj;
        if (lhL == null || (list = lhL.A00) == null || this.A00.size() != list.size()) {
            return false;
        }
        return true;
    }
}
