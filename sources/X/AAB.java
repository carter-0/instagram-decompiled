package X;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class AAB {
    public static RemoteInput A00(A7Y a7y) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(a7y.A03).setLabel(a7y.A02).setChoices(a7y.A06).setAllowFreeFormInput(a7y.A05).addExtras(a7y.A01);
        Iterator it = a7y.A04.iterator();
        while (it.hasNext()) {
            addExtras.setAllowDataType(AnonymousClass7TE.A18(it), true);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            AAC.A01(addExtras, a7y.A00);
        }
        return addExtras.build();
    }

    public static A7Y A01(Object obj) {
        RemoteInput remoteInput = (RemoteInput) obj;
        String resultKey = remoteInput.getResultKey();
        HashSet A1F = AnonymousClass7TE.A1F();
        Bundle A0a = AnonymousClass7TE.A0a();
        int i = 0;
        if (resultKey != null) {
            CharSequence label = remoteInput.getLabel();
            CharSequence[] choices = remoteInput.getChoices();
            boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
            Bundle extras = remoteInput.getExtras();
            if (extras != null) {
                A0a.putAll(extras);
            }
            Set<String> allowedDataTypes = remoteInput.getAllowedDataTypes();
            if (allowedDataTypes != null) {
                for (String add : allowedDataTypes) {
                    A1F.add(add);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                i = AAC.A00(remoteInput);
            }
            return new A7Y(A0a, label, resultKey, A1F, choices, i, allowFreeFormInput);
        }
        throw AnonymousClass7TE.A0w("Result key can't be null");
    }
}
