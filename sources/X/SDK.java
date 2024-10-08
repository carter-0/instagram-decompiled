package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class SDK {
    public static final Map A00;
    public static final Set A01;
    public static final Set A02;
    public static final Set A03;
    public static final Set A04;
    public static final Set A05;
    public static final Set A06;
    public static final Set A07;
    public static final Set A08;
    public static final Set A09 = Pxg.A18(new String[]{"ml-cc-exp", "ml-cc-exp-month", "ml-cc-exp-year", "ml-cc-csc"});
    public static final Set A0A;
    public static final Set A0B = Pxg.A18(new String[]{"cc-number", "cc-exp", "cc-exp-month", "cc-exp-year", "cc-csc"});
    public static final Set A0C = Pxg.A18(new String[]{"CONTACT_AUTOFILL", "PAYMENT_AUTOFILL"});
    public static final Set A0D = Pxg.A18(new String[]{"CONTACT_AUTOFILL", "CONTACT_AND_PAYMENT_AUTOFILL"});
    public static final Set A0E = Pxg.A18(new String[]{"PAYMENT_AUTOFILL", "CONTACT_AND_PAYMENT_AUTOFILL"});
    public static final Set A0F;

    public static Set A00(Collection collection, Collection collection2) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(collection);
        hashSet.addAll(collection2);
        return Collections.unmodifiableSet(Collections.unmodifiableSet(hashSet));
    }

    static {
        Set A18 = Pxg.A18(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "given-name", "family-name"});
        A05 = A18;
        Set A182 = Pxg.A18(new String[]{"tel", "address-line1", "address-line2", "address-level1", "address-level2", "country", "email"});
        A06 = A182;
        Set A183 = Pxg.A18(new String[]{"cc-name", "cc-given-name", "cc-additional-name", "cc-family-name", "cc-number", "cc-exp", "cc-exp-month", "cc-exp-year", "cc-csc"});
        A0A = A183;
        Set A184 = Pxg.A18(new String[]{"cc-name", "cc-given-name", "cc-additional-name", "cc-family-name"});
        A01 = A184;
        Set A185 = Pxg.A18(new String[]{Pxz.A00(19, 8, 88), "email", "current-password"});
        A08 = A185;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put("cc-number", "raw-cc-number");
        builder.put("cc-csc", "raw-cc-csc");
        builder.put("cc-exp", "raw-cc-exp");
        builder.put("cc-exp-year", "raw-cc-exp-year");
        A00 = Pxe.A0Z(builder, "cc-exp-month", "raw-cc-exp-month");
        HashSet A1F = AnonymousClass7TE.A1F();
        A1F.addAll(A18);
        A1F.addAll(A182);
        A1F.add("postal-code");
        Set unmodifiableSet = Collections.unmodifiableSet(A1F);
        A03 = unmodifiableSet;
        A07 = A00(A183, unmodifiableSet);
        A0F = A00(A185, unmodifiableSet);
        A02 = A00(unmodifiableSet, A184);
        A04 = A00(A18, A184);
    }
}
