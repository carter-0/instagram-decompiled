package X;

import android.animation.ValueAnimator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class U05 extends AnonymousClass3AQ {
    public final LinkedHashMap A00 = new LinkedHashMap();
    public final LinkedHashMap A01 = new LinkedHashMap();
    public final LinkedHashMap A02 = new LinkedHashMap();

    public final boolean A0R(C249703kE r4) {
        0qQ.A0B(r4, 0);
        this.A01.put(r4, new C17577VaV(r4, true));
        return true;
    }

    public final boolean A0S(C249703kE r4) {
        0qQ.A0B(r4, 0);
        if (!(r4 instanceof C60635Joi)) {
            return true;
        }
        AnonymousClass3O0 r1 = (AnonymousClass3O0) ((C60635Joi) r4).A02.getValue();
        ValueAnimator valueAnimator = r1.A01;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            r1.A01.cancel();
        }
        this.A02.put(r4, new C17577VaV(r4, false));
        return true;
    }

    public final void A0I() {
        LinkedHashMap linkedHashMap = this.A02;
        Iterator A0s = AnonymousClass7TF.A0s(linkedHashMap);
        while (A0s.hasNext()) {
            C17577VaV vaV = (C17577VaV) ((Map.Entry) A0s.next()).getValue();
            vaV.A01.A08();
            vaV.A02.A08();
            vaV.A03.A08();
        }
        linkedHashMap.clear();
        LinkedHashMap linkedHashMap2 = this.A01;
        Iterator A0s2 = AnonymousClass7TF.A0s(linkedHashMap2);
        while (A0s2.hasNext()) {
            C17577VaV vaV2 = (C17577VaV) ((Map.Entry) A0s2.next()).getValue();
            vaV2.A01.A08();
            vaV2.A02.A08();
            vaV2.A03.A08();
        }
        linkedHashMap2.clear();
        LinkedHashMap linkedHashMap3 = this.A00;
        Iterator A0s3 = AnonymousClass7TF.A0s(linkedHashMap3);
        while (A0s3.hasNext()) {
            C17577VaV vaV3 = (C17577VaV) ((Map.Entry) A0s3.next()).getValue();
            vaV3.A01.A08();
            vaV3.A02.A08();
            vaV3.A03.A08();
        }
        linkedHashMap3.clear();
        super.A0I();
    }

    public final void A0J() {
        LinkedHashMap linkedHashMap = this.A02;
        if (linkedHashMap.isEmpty()) {
            LinkedHashMap linkedHashMap2 = this.A01;
            Iterator A0s = AnonymousClass7TF.A0s(new HashMap(linkedHashMap2));
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                linkedHashMap2.remove(A1J.getKey());
                super.A0R((C249703kE) A1J.getKey());
            }
            super.A0J();
            return;
        }
        A00(linkedHashMap);
        A00(this.A01);
    }

    public final void A0K(C249703kE r4) {
        LinkedHashMap linkedHashMap = this.A01;
        if (linkedHashMap.containsKey(r4)) {
            r4.itemView.setAlpha(1.0f);
            linkedHashMap.remove(r4);
            return;
        }
        super.A0K(r4);
    }

    public final boolean A0L() {
        if ((!this.A02.isEmpty()) || (!this.A01.isEmpty()) || (!this.A00.isEmpty()) || super.A0L()) {
            return true;
        }
        return false;
    }

    private final void A00(HashMap hashMap) {
        Iterator A0s = AnonymousClass7TF.A0s(hashMap);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Dbb.A1V(A1J, this.A00);
            C17577VaV vaV = (C17577VaV) A1J.getValue();
            C17219VMx vMx = new C17219VMx(this);
            C14090Tph tph = vaV.A03;
            tph.A05(new C18945WDy(vMx, vaV));
            C14090Tph tph2 = vaV.A01;
            float f = vaV.A00;
            tph2.A09(f);
            vaV.A02.A09(f);
            tph.A09(f);
        }
        hashMap.clear();
    }
}
