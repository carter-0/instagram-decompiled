package X;

import androidx.paging.AsyncPagingDataDiffer$differBase$1;
import com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry;
import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel;
import com.instagram.direct.send.mutation.armadilloexpresstransport.media.DirectConfigureMediaCollectionMessageMutationFactory;
import com.instagram.settings2.core.session.SettingsSession;
import com.instagram.settings2.core.viewmodel.UiStateKt;
import java.util.List;

public final class ME2 extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public final int A09;

    /* JADX WARNING: type inference failed for: r10v0, types: [X.ME2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        switch (this.A09) {
            case 0:
                this.A06 = obj;
                A01(this);
                return AsyncPagingDataDiffer$differBase$1.A00((AsyncPagingDataDiffer$differBase$1) this.A07, (MRP) null, (LP3) null, (LP3) null, (List) null, this, 0, 0, false);
            case 1:
                this.A06 = obj;
                A01(this);
                return ((CdlProviderHolderRegistry) this.A07).A00((C15046UKz) null, (CommonCdlProviderHolder) null, (C18073Vl1) null, this, false);
            case 2:
                this.A06 = obj;
                A01(this);
                return ClipsCreationDraftViewModel.A03((ClipsCreationDraftViewModel) this.A07, (C293505kq) null, this, (0sP) null, false, false, false);
            case 3:
                this.A06 = obj;
                A01(this);
                return DirectConfigureMediaCollectionMessageMutationFactory.A01((C254703su) null, (DirectConfigureMediaCollectionMessageMutationFactory) this.A07, this, false);
            case 4:
                this.A07 = obj;
                A01(this);
                return UiStateKt.A00((C53400GnX) null, (SettingsSession) null, (I4T) null, (List) null, this, false);
            default:
                this.A07 = obj;
                A01(this);
                return UiStateKt.A06((C61243Jzb) null, (SettingsSession) null, (I4T) null, this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME2(Object obj, AnonymousClass4D7 r2, int i) {
        super(r2);
        this.A09 = i;
        this.A07 = obj;
    }

    public static void A00(Object obj, Object obj2, Object obj3, Object obj4, ME2 me2) {
        me2.A01 = obj;
        me2.A02 = obj2;
        me2.A03 = obj3;
        me2.A04 = obj4;
    }

    public static void A01(ME2 me2) {
        me2.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public static boolean A02(int i, Object obj) {
        if (!(obj instanceof ME2) || ((ME2) obj).A09 != i) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ME2(int i, AnonymousClass4D7 r2) {
        super(r2);
        this.A09 = i;
    }
}
