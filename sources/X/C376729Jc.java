package X;

import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.archive.data.HighlightsSettingsRepository;

/* renamed from: X.9Jc  reason: invalid class name and case insensitive filesystem */
public final class C376729Jc extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final Object A07;

    /* JADX WARNING: type inference failed for: r10v0, types: [X.9Jc, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A03 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        if (i != 0) {
            return HighlightsSettingsRepository.A00((HighlightsSettingsRepository) this.A07, this, (0sP) null, (0sP) null, false, false, false, false);
        }
        return ((EffectCollectionService) this.A07).A0B((C346197ul) null, this, false, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376729Jc(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A07 = obj;
    }
}
