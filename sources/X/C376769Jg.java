package X;

import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryImpl;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl;
import java.util.List;

/* renamed from: X.9Jg  reason: invalid class name and case insensitive filesystem */
public final class C376769Jg extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376769Jg(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A06 = i;
        this.A07 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4D7, X.9Jg] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A06;
        this.A05 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        Object obj2 = this.A07;
        switch (i) {
            case 0:
                return ((ContentFilterDictionaryImpl) obj2).Bat(this, false);
            case 1:
                return ContentFilterDictionaryRegistrar.A01((ContentFilterDictionaryRegistrar) obj2, (List) null, this);
            default:
                return ContentFilterEngineImpl.A00((ContentFilterDictionaryImpl) null, (ContentFilterEngineImpl) obj2, this);
        }
    }
}
