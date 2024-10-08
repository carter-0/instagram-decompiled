package X;

import android.content.Context;
import com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry;
import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;

/* renamed from: X.KpS  reason: case insensitive filesystem */
public abstract class C62976KpS {
    public static final CommonCdlProviderHolder A00(Context context, IgCdlProviderBuilder igCdlProviderBuilder) {
        CdlProviderHolderRegistry cdlProviderHolderRegistry;
        AnonymousClass7TG.A1N(igCdlProviderBuilder, context);
        CommonCdlProviderHolder commonCdlProviderHolder = CommonCdlProviderHolder.A07;
        if (commonCdlProviderHolder == null) {
            commonCdlProviderHolder = new CommonCdlProviderHolder(context, igCdlProviderBuilder);
            CommonCdlProviderHolder.A07 = commonCdlProviderHolder;
            C62975KpR kpR = CdlProviderHolderRegistry.A04;
            IgCdlProviderBuilder igCdlProviderBuilder2 = commonCdlProviderHolder.A03;
            synchronized (kpR) {
                cdlProviderHolderRegistry = CdlProviderHolderRegistry.A03;
                if (cdlProviderHolderRegistry == null) {
                    cdlProviderHolderRegistry = new CdlProviderHolderRegistry(igCdlProviderBuilder2);
                    CdlProviderHolderRegistry.A03 = cdlProviderHolderRegistry;
                }
            }
            commonCdlProviderHolder.A00 = cdlProviderHolderRegistry;
        }
        return commonCdlProviderHolder;
    }
}
