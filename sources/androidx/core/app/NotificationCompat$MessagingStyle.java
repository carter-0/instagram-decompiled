package androidx.core.app;

import X.AA2;
import X.AAA;
import X.AGq;
import X.AH5;
import X.AnonymousClass9T8;
import X.C370398wN;
import X.C370408wO;
import android.app.Notification;
import android.app.Person;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

public final class NotificationCompat$MessagingStyle extends AA2 {
    public Boolean A00;
    public CharSequence A01;
    public AH5 A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();

    public final String A03() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    public final void A06(C370408wO r9) {
        AnonymousClass9T8 r0 = this.A00;
        boolean z = false;
        if (r0 == null || r0.A0E.getApplicationInfo().targetSdkVersion >= 28 || this.A00 != null) {
            Boolean bool = this.A00;
            if (bool != null) {
                z = bool.booleanValue();
            }
        } else if (this.A01 != null) {
            z = true;
        }
        this.A00 = Boolean.valueOf(z);
        Notification.MessagingStyle messagingStyle = new Notification.MessagingStyle(AAA.A00(this.A02));
        for (AGq aGq : this.A03) {
            AH5 ah5 = aGq.A04;
            Person person = null;
            CharSequence charSequence = aGq.A05;
            long j = aGq.A03;
            if (ah5 != null) {
                person = AAA.A00(ah5);
            }
            Notification.MessagingStyle.Message message = new Notification.MessagingStyle.Message(charSequence, j, person);
            String str = aGq.A02;
            if (str != null) {
                message.setData(str, aGq.A00);
            }
            messagingStyle.addMessage(message);
        }
        for (AGq aGq2 : this.A04) {
            AH5 ah52 = aGq2.A04;
            Person person2 = null;
            CharSequence charSequence2 = aGq2.A05;
            long j2 = aGq2.A03;
            if (ah52 != null) {
                person2 = AAA.A00(ah52);
            }
            Notification.MessagingStyle.Message message2 = new Notification.MessagingStyle.Message(charSequence2, j2, person2);
            String str2 = aGq2.A02;
            if (str2 != null) {
                message2.setData(str2, aGq2.A00);
            }
            messagingStyle.addHistoricMessage(message2);
        }
        messagingStyle.setConversationTitle(this.A01);
        messagingStyle.setGroupConversation(this.A00.booleanValue());
        messagingStyle.setBuilder(((C370398wN) r9).A04);
    }

    public NotificationCompat$MessagingStyle(AH5 ah5) {
        if (!TextUtils.isEmpty(ah5.A01)) {
            this.A02 = ah5;
            return;
        }
        throw new IllegalArgumentException("User's name must not be empty.");
    }

    public final void A01(Bundle bundle) {
        super.A01(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0054, code lost:
        r4.putInt(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r5.A02);
        r4.putInt("int1", r5.A00);
        r4.putInt("int2", r5.A01);
        r4.putString("string1", r5.A07);
        r1 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0072, code lost:
        if (r1 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        r4.putParcelable("tint_list", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0079, code lost:
        r1 = r5.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007d, code lost:
        if (r1 == androidx.core.graphics.drawable.IconCompat.A0A) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007f, code lost:
        r4.putString("tint_mode", r1.name());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        r4.putParcelable("obj", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.os.Bundle r7) {
        /*
            r6 = this;
            super.A04(r7)
            X.AH5 r0 = r6.A02
            java.lang.CharSequence r1 = r0.A01
            java.lang.String r0 = "android.selfDisplayName"
            r7.putCharSequence(r0, r1)
            X.AH5 r3 = r6.A02
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.CharSequence r1 = r3.A01
            java.lang.String r0 = "name"
            r2.putCharSequence(r0, r1)
            androidx.core.graphics.drawable.IconCompat r5 = r3.A00
            if (r5 == 0) goto L_0x004b
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            int r0 = r5.A02
            java.lang.String r1 = "obj"
            switch(r0) {
                case -1: goto L_0x0043;
                case 0: goto L_0x002a;
                case 1: goto L_0x003e;
                case 2: goto L_0x004d;
                case 3: goto L_0x0036;
                case 4: goto L_0x004d;
                case 5: goto L_0x003e;
                case 6: goto L_0x004d;
                default: goto L_0x002a;
            }
        L_0x002a:
            r0 = 580(0x244, float:8.13E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0036:
            java.lang.Object r0 = r5.A06
            byte[] r0 = (byte[]) r0
            r4.putByteArray(r1, r0)
            goto L_0x0054
        L_0x003e:
            java.lang.Object r0 = r5.A06
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            goto L_0x0047
        L_0x0043:
            java.lang.Object r0 = r5.A06
            android.os.Parcelable r0 = (android.os.Parcelable) r0
        L_0x0047:
            r4.putParcelable(r1, r0)
            goto L_0x0054
        L_0x004b:
            r4 = 0
            goto L_0x0088
        L_0x004d:
            java.lang.Object r0 = r5.A06
            java.lang.String r0 = (java.lang.String) r0
            r4.putString(r1, r0)
        L_0x0054:
            int r1 = r5.A02
            java.lang.String r0 = "type"
            r4.putInt(r0, r1)
            int r1 = r5.A00
            java.lang.String r0 = "int1"
            r4.putInt(r0, r1)
            int r1 = r5.A01
            java.lang.String r0 = "int2"
            r4.putInt(r0, r1)
            java.lang.String r1 = r5.A07
            java.lang.String r0 = "string1"
            r4.putString(r0, r1)
            android.content.res.ColorStateList r1 = r5.A03
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "tint_list"
            r4.putParcelable(r0, r1)
        L_0x0079:
            android.graphics.PorterDuff$Mode r1 = r5.A04
            android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.A0A
            if (r1 == r0) goto L_0x0088
            java.lang.String r1 = r1.name()
            java.lang.String r0 = "tint_mode"
            r4.putString(r0, r1)
        L_0x0088:
            java.lang.String r0 = "icon"
            r2.putBundle(r0, r4)
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "uri"
            r2.putString(r0, r1)
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "key"
            r2.putString(r0, r1)
            boolean r1 = r3.A04
            java.lang.String r0 = "isBot"
            r2.putBoolean(r0, r1)
            boolean r1 = r3.A05
            java.lang.String r0 = "isImportant"
            r2.putBoolean(r0, r1)
            java.lang.String r0 = "android.messagingStyleUser"
            r7.putBundle(r0, r2)
            java.lang.CharSequence r1 = r6.A01
            java.lang.String r0 = "android.hiddenConversationTitle"
            r7.putCharSequence(r0, r1)
            java.lang.CharSequence r1 = r6.A01
            if (r1 == 0) goto L_0x00c6
            java.lang.Boolean r0 = r6.A00
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "android.conversationTitle"
            r7.putCharSequence(r0, r1)
        L_0x00c6:
            java.util.List r1 = r6.A03
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00d7
            android.os.Bundle[] r1 = X.AGq.A01(r1)
            java.lang.String r0 = "android.messages"
            r7.putParcelableArray(r0, r1)
        L_0x00d7:
            java.util.List r1 = r6.A04
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00e8
            android.os.Bundle[] r1 = X.AGq.A01(r1)
            java.lang.String r0 = "android.messages.historic"
            r7.putParcelableArray(r0, r1)
        L_0x00e8:
            java.lang.Boolean r0 = r6.A00
            if (r0 == 0) goto L_0x00f5
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "android.isGroupConversation"
            r7.putBoolean(r0, r1)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$MessagingStyle.A04(android.os.Bundle):void");
    }

    public final void A05(Bundle bundle) {
        AH5 ah5;
        super.A05(bundle);
        List list = this.A03;
        list.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            ah5 = AH5.A00(bundle.getBundle("android.messagingStyleUser"));
        } else {
            ah5 = new AH5((IconCompat) null, bundle.getString("android.selfDisplayName"), (String) null, (String) null, false, false);
        }
        this.A02 = ah5;
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.A01 = charSequence;
        if (charSequence == null) {
            this.A01 = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            list.addAll(AGq.A00(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.A04.addAll(AGq.A00(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.A00 = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public NotificationCompat$MessagingStyle() {
    }
}
