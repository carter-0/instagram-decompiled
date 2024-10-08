package X;

import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.7BO  reason: invalid class name */
public final class AnonymousClass7BO extends AnonymousClass7BP {
    public AnonymousClass6BH A00;
    public final ThreadFetchReason A01;
    public final String A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;
    public final /* synthetic */ 1bO A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7BO(ThreadFetchReason threadFetchReason, C74340PtG ptG, 1bO r4, Boolean bool, List list) {
        super(ptG, r4);
        this.A06 = r4;
        this.A02 = null;
        this.A04 = true;
        this.A03 = Collections.unmodifiableList(list);
        this.A05 = bool.booleanValue();
        this.A01 = threadFetchReason;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7BO(ThreadFetchReason threadFetchReason, C74340PtG ptG, 1bO r5, DirectThreadKey directThreadKey) {
        super(ptG, r5);
        ArrayList arrayList;
        this.A06 = r5;
        this.A02 = directThreadKey.A00;
        this.A04 = true;
        List list = directThreadKey.A02;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list);
        }
        this.A03 = arrayList;
        this.A05 = false;
        this.A01 = threadFetchReason;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7BO(ThreadFetchReason threadFetchReason, C74340PtG ptG, 1bO r4, String str, boolean z) {
        super(ptG, r4);
        this.A06 = r4;
        this.A04 = z;
        this.A02 = str;
        this.A03 = null;
        this.A05 = false;
        this.A01 = threadFetchReason;
    }
}
