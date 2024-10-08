package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Uda  reason: case insensitive filesystem */
public final class C15485Uda extends 2Ru implements AnonymousClass71P {
    public final List A00 = new ArrayList();
    public final AnonymousClass71R A01;
    public final AnonymousClass32Q A02;
    public final C231762sK A03;
    public final Map A04 = new HashMap();

    public C15485Uda(Context context, AnonymousClass0iw r11, UserSession userSession, AnonymousClass32J r13) {
        super(DbW.A1Z(userSession));
        AnonymousClass32Q r6 = AnonymousClass32Q.A01;
        this.A02 = r6;
        AnonymousClass71R r1 = new AnonymousClass71R(r11, userSession, (C267644bx) null, r13, r6, (String) null, (String) null);
        this.A01 = r1;
        r1.A00 = 1.0f;
        C231762sK r0 = new C231762sK(context);
        this.A03 = r0;
        init(new C231642s0[]{r1, r0});
    }

    public final void A00(C229122ms r9, List list) {
        int i;
        int i2;
        boolean z;
        if (list != null) {
            this.A00.addAll(list);
        }
        clear();
        boolean CKB = r9.CKB();
        List list2 = this.A00;
        int size = list2.size();
        if (CKB) {
            i = 3;
            i2 = size / 3;
        } else {
            i = 3;
            i2 = ((size - 1) / 3) + 1;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C3251571g r3 = new C3251571g(list2, i3 * 3, i);
            AnonymousClass6u8 BQA = BQA(AnonymousClass7TF.A0h(r3));
            if (!r9.CKB()) {
                z = true;
                if (i3 == i2 - 1) {
                    BQA.A00(i3, z);
                    addModel(r3, BQA, this.A01);
                }
            }
            z = false;
            BQA.A00(i3, z);
            addModel(r3, BQA, this.A01);
        }
        addModel(r9, (Object) null, this.A03);
        notifyDataSetChangedSmart();
    }

    public final AnonymousClass6u8 BQA(String str) {
        0qQ.A0B(str, 0);
        return C13991Tnr.A0P(str, this.A04);
    }
}
