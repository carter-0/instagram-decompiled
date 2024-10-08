package X;

import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;
import java.util.List;

public final class MDP extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;
    public final Object A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDP(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A08 = i;
        this.A09 = obj;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4D7, X.MDP] */
    public final Object invokeSuspend(Object obj) {
        int i = this.A08;
        this.A07 = obj;
        this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        switch (i) {
            case 0:
                return ((ECPRepositoryImpl) this.A09).A03((ECPHandler) null, (ECPPaymentRequest) null, (TransactionInfo) null, (String) null, (List) null, this, false);
            case 1:
                return ((MainFeedLocalDataSource) this.A09).A05(this, false);
            default:
                return C64185LSs.A00(this.A09, this);
        }
    }
}
