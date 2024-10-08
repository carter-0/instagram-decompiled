package X;

import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.logging.LoggingPolicy;
import com.instagram.settings2.core.session.SettingsSession;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import java.util.List;

/* renamed from: X.MDf  reason: case insensitive filesystem */
public final class C66127MDf extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public boolean A09;
    public final int A0A = 1;

    public C66127MDf(AnonymousClass4D7 r2) {
        super(r2);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.MDf, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        if (this.A0A != 0) {
            this.A07 = obj;
            this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
            return UiStateKt.A02((C61241JzZ) null, (SettingsSession) null, (I4T) null, this);
        }
        this.A06 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return ECPRepositoryImpl.A00((CheckoutConfiguration) null, (ECPRepositoryImpl) this.A07, (LoggingPolicy) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, this, false, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66127MDf(ECPRepositoryImpl eCPRepositoryImpl, AnonymousClass4D7 r3) {
        super(r3);
        this.A07 = eCPRepositoryImpl;
    }
}
