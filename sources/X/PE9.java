package X;

import android.graphics.Color;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.infocenter.model.ShareInfo;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;

public final /* synthetic */ class PE9 implements B1V {
    public final /* synthetic */ AnonymousClass7Z6 A00;
    public final /* synthetic */ InfoCenterShareInfoIntf A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ PE9(AnonymousClass7Z6 r1, InfoCenterShareInfoIntf infoCenterShareInfoIntf, String str, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = str;
        this.A01 = infoCenterShareInfoIntf;
    }

    public final 1bp AXP(C70621ODs oDs, DirectThreadKey directThreadKey, Boolean bool, Long l) {
        AnonymousClass7Z6 r0 = this.A00;
        boolean z = this.A03;
        String str = this.A02;
        InfoCenterShareInfoIntf infoCenterShareInfoIntf = this.A01;
        DirectThreadKey directThreadKey2 = directThreadKey;
        Long l2 = l;
        1bp r14 = new 1bp(C66669Mac.A05(r0.A00, oDs, C65581eX.class, str, z), directThreadKey2, l2, AnonymousClass7TG.A0H());
        ShareInfo shareInfo = (ShareInfo) infoCenterShareInfoIntf;
        r14.A01 = shareInfo.A05;
        String str2 = shareInfo.A0A;
        String str3 = shareInfo.A08;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("#%06X", Integer.valueOf(Color.parseColor(shareInfo.A09) & 16777215));
        String str4 = shareInfo.A07;
        ExtendedImageUrl extendedImageUrl = shareInfo.A01;
        ExtendedImageUrl extendedImageUrl2 = new ExtendedImageUrl(extendedImageUrl.A0A, extendedImageUrl.getWidth(), extendedImageUrl.getHeight());
        ExtendedImageUrl extendedImageUrl3 = shareInfo.A02;
        C254873tC A05 = C71152OeO.A05((ExtendedImageUrl) null, extendedImageUrl2, new ExtendedImageUrl(extendedImageUrl3.A0A, extendedImageUrl3.getWidth(), extendedImageUrl3.getHeight()), (String) null, str2, str3, str4, 0, 0);
        A05.A1P = formatStrLocaleSafe;
        r14.A02 = Collections.singletonList(A05);
        r14.A00 = infoCenterShareInfoIntf;
        return r14;
    }
}
