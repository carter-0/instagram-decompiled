package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes;
import java.util.Map;

public final class A8r {
    public final UserSession A00;
    public final AnonymousClass7UH A01;
    public final AnonymousClass8KY A02;

    public final void A00(C254933tI r29, DirectShareTarget directShareTarget, Integer num, Integer num2, Long l, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Boolean bool;
        Integer num3;
        C254783t2 r11;
        LocalSendSpeedMessageTypes localSendSpeedMessageTypes;
        boolean z6;
        String str2;
        C254743sy A022;
        C254743sy A023;
        Integer num4 = num2;
        int intValue = num4.intValue();
        if (intValue == 2 || intValue == 3 || intValue == 7) {
            Integer A012 = AEM.A01(num4);
            AnonymousClass7UH r9 = this.A01;
            AnonymousClass8KY r6 = this.A02;
            Long l2 = null;
            DirectShareTarget directShareTarget2 = directShareTarget;
            boolean z7 = z;
            C254923tH A013 = r6.A01(directShareTarget2, (Boolean) null, A012, z7, false);
            C254743sy r23 = null;
            if (directShareTarget != null) {
                bool = Boolean.valueOf(directShareTarget2.A0M());
            } else {
                bool = null;
            }
            if (num != null) {
                num3 = num;
            } else if (directShareTarget != null) {
                num3 = Integer.valueOf(directShareTarget2.A01);
            } else {
                num3 = null;
            }
            Map A002 = AnonymousClass8KY.A00(Boolean.valueOf(z7), z2, z3);
            Long l3 = l;
            Map A0w = AnonymousClass7TF.A0w("ephemeral_lifetime_ms", l3);
            if (directShareTarget != null) {
                r11 = directShareTarget2.A09;
                r11.getClass();
                r23 = directShareTarget2.A02();
            } else {
                r11 = null;
            }
            String str3 = str;
            r9.A00(A013, r11, bool, r6.A02(r23, (Boolean) null, A012, z7, false), num4, num3, str3, A002, A0w);
            int i2 = i;
            if (i != 0) {
                r9.A01.markerAnnotate(r9.A00, str3.hashCode(), C66579MXk.A00(1122), i2);
            }
            switch (intValue) {
                case 2:
                    localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.PHOTO;
                    break;
                case 3:
                    localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.VIDEO;
                    break;
                case 5:
                    localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.GIF;
                    break;
                case 6:
                    localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.STICKER;
                    break;
                case 7:
                    localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.COLLECTION;
                    break;
                default:
                    localSendSpeedMessageTypes = LocalSendSpeedMessageTypes.TEXT;
                    break;
            }
            Integer A014 = AEM.A01(num4);
            int hashCode = str3.hashCode();
            UserSession userSession = this.A00;
            C69240Nhu A015 = C328727Fx.A01(userSession, hashCode);
            if (A015 != null) {
                boolean z8 = false;
                if (directShareTarget != null) {
                    z6 = directShareTarget2.A0M();
                } else {
                    z6 = false;
                }
                A015.onStartFlow(z6);
                A015.annotateMessageType(localSendSpeedMessageTypes);
                A015.annotateLocalDataId(str3);
                A015.onLogDataProcessingStart();
                if (directShareTarget != null) {
                    C254783t2 r5 = directShareTarget2.A09;
                    r5.getClass();
                    str2 = AnonymousClass4KK.A02(r5);
                } else {
                    str2 = null;
                }
                A015.annotateOpenThreadId(str2);
                if (directShareTarget != null) {
                    C254783t2 r1 = directShareTarget2.A09;
                    r1.getClass();
                    l2 = AnonymousClass4KK.A01(r1);
                }
                A015.annotateOccamadilloThreadId(l2);
                if (!(num == null && (directShareTarget == null || (num = Integer.valueOf(directShareTarget2.A01)) == null))) {
                    int intValue2 = num.intValue();
                    A015.annotateThreadType(intValue2, AnonymousClass48O.A00(intValue2));
                }
                C254933tI r52 = r29;
                A015.annotateIsReply(AnonymousClass7TF.A1V(r52));
                if (r29 != null) {
                    A015.annotateReplyToType(r52.A0F.A00);
                    if ((directShareTarget == null || (A023 = directShareTarget2.A02()) == null || !(A023 instanceof MsysThreadId)) && !r52.A05()) {
                        z8 = true;
                    }
                }
                boolean z9 = z4;
                C254923tH A016 = r6.A01(directShareTarget2, Boolean.valueOf(z9), A014, z7, z8);
                A015.annotateTransportType(A016.A00);
                A015.annotateIsEncrypted(AnonymousClass7TF.A1W(A016, C254923tH.ACT));
                A015.annotateIsVm(z7);
                A015.annotateIsDm(z9);
                A015.annotateEphemeralLifetimeMs(l3);
                A015.annotateIsInstamadillo(z5);
                if (!(directShareTarget == null || (A022 = directShareTarget2.A02()) == null)) {
                    A015.annotateIsMsys(A022 instanceof MsysThreadId);
                }
                A015.onLogTransportMessageStart();
                if (i != 0) {
                    A015.annotateSendGroupSize(i2);
                }
                A015.annotateMediaPreviewEnabled(C395059z9.A00(userSession));
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A1B(002.A0R(Pxd.A00(73), C395299zX.A00(num4)));
    }

    public /* synthetic */ A8r(UserSession userSession) {
        AnonymousClass7UH A002 = AnonymousClass7UG.A00(userSession);
        AnonymousClass8KY r0 = new AnonymousClass8KY(userSession);
        AnonymousClass7TG.A1O(userSession, A002);
        this.A00 = userSession;
        this.A01 = A002;
        this.A02 = r0;
    }
}
