package X;

import com.facebook.common.callercontext.CallerContext;
import fxcache.model.FxCalAccountLinkageInfoForSwitcher;
import fxcache.model.FxCalAccountWithSwitcherInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9ER  reason: invalid class name */
public final class AnonymousClass9ER implements AnonymousClass2Kv {
    public final /* synthetic */ AnonymousClass9EN A00;

    public AnonymousClass9ER(AnonymousClass9EN r1) {
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r24) {
        0sn arrayList;
        long currentTimeMillis;
        String str;
        if (r24 != null) {
            C250663lr r6 = (C250663lr) r24.Bny();
            AnonymousClass9EN r4 = this.A00;
            if (r6 == null) {
                arrayList = 0sn.A00;
                currentTimeMillis = 0;
            } else {
                arrayList = new ArrayList();
                C249803kO it = r6.getRequiredCompactedTreeListField(0, "switcher_accounts_data(account_types:[\"FACEBOOK\",\"INSTAGRAM\"],caller_name:$caller_name,family_device_id:$family_device_id,should_force_badge_refresh:$should_force_badge_refresh)", AnonymousClass5w3.class, -735616906).iterator();
                0qQ.A07(it);
                while (it.hasNext()) {
                    C250663lr r62 = (C250663lr) it.next();
                    0qQ.A0A(r62);
                    0qQ.A0B(r62, 0);
                    int coercedIntField = r62.getCoercedIntField(0, "badge_count");
                    int coercedIntField2 = r62.getCoercedIntField(1, "unfiltered_badge_count");
                    String optionalStringField = r62.getOptionalStringField(2, "unpacked_notifications");
                    boolean coercedBooleanField = r62.getCoercedBooleanField(3, "has_threads_account");
                    C250663lr optionalTreeField = r62.getOptionalTreeField(4, "threads_profile_picture_info", AnonymousClass5w4.class, -900062966);
                    if (optionalTreeField != null) {
                        str = optionalTreeField.getOptionalStringField(0, "url");
                    } else {
                        str = null;
                    }
                    arrayList.add(new FxCalAccountWithSwitcherInfo("", "", "", "", "", "", r62.getOptionalStringField(5, "obfuscated_id"), optionalStringField, str, coercedIntField, coercedIntField2, 0, coercedBooleanField));
                }
                currentTimeMillis = System.currentTimeMillis();
            }
            FxCalAccountLinkageInfoForSwitcher fxCalAccountLinkageInfoForSwitcher = new FxCalAccountLinkageInfoForSwitcher(AnonymousClass05K.A00, arrayList, currentTimeMillis);
            1wM r8 = r4.A01;
            1wg r63 = r8.A07;
            String str2 = r4.A03;
            CallerContext callerContext = r4.A00;
            String str3 = callerContext.A02;
            0qQ.A07(str3);
            r63.A04("manual_fetch_success", str2, (List) null, 0Yt.A02(new 0eP[]{new 0eP("caller_class", str3)}));
            r8.A0B(callerContext, fxCalAccountLinkageInfoForSwitcher);
            C363768kJ r0 = r4.A02;
            if (r0 != null) {
                r0.onSuccess();
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
