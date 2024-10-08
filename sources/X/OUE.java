package X;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.visual.model.DirectVisualMessageItemModel;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

public final class OUE {
    public static final DirectVisualMessageItemModel A00(C74552Pwl pwl, int i) {
        Long Acs = pwl.Acs(i);
        if (Acs != null) {
            long longValue = Acs.longValue();
            Integer Acu = pwl.Acu(i);
            if (Acu != null) {
                int intValue = Acu.intValue();
                Uri A00 = OXF.A00(pwl.Acp(i), (String) null, longValue);
                Uri A002 = OXF.A00(pwl.Act(i), (String) null, longValue);
                String BSF = pwl.BSF(i);
                String BsK = pwl.BsK(i);
                long C7b = pwl.C7b(i);
                boolean A1S = AnonymousClass7TF.A1S(intValue, 4);
                Integer BS8 = pwl.BS8(i);
                if (BS8 != null) {
                    return new DirectVisualMessageItemModel(new DirectVisualMessageItemModel.MediaFields.TamMedia(A00, A002), (PrivacyMediaOverlayViewModel) null, BSF, BsK, pwl.BXo(i), BS8.intValue(), C7b, A1S);
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        return null;
    }

    public final ImmutableList A01(MessagingUser messagingUser, C74552Pwl pwl, int i) {
        Integer CFk;
        Integer CFk2;
        DirectVisualMessageItemModel A00;
        AnonymousClass7TG.A1P(pwl, messagingUser);
        DirectVisualMessageItemModel A002 = A00(pwl, i);
        if (A002 == null) {
            return null;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        if (C74552Pwl.A02(messagingUser, pwl, i) || (CFk = pwl.CFk(i)) == null || CFk.intValue() != 0) {
            builder.add(A002);
        } else {
            int count = pwl.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                int count2 = (i2 + i) % pwl.getCount();
                if (pwl.BS3(count2) == 8 && pwl.CFj(count2) && (CFk2 = pwl.CFk(count2)) != null && CFk2.intValue() == 0 && !C74552Pwl.A02(messagingUser, pwl, count2)) {
                    if (count2 == i) {
                        A00 = A002;
                    } else {
                        A00 = A00(pwl, count2);
                    }
                    builder.add(A00);
                }
            }
        }
        return builder.build();
    }
}
