package X;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public final class MY5 {
    public boolean A00 = false;
    public final 0bY A01;
    public final HashMap A02 = AnonymousClass7TE.A1E();
    public final boolean A03;
    public final Context A04;
    public final HashSet A05;

    public MY5(Context context, ProviderInfo providerInfo, 0bY r10, String str) {
        HashSet A12;
        StringBuilder A1A;
        this.A04 = context;
        this.A01 = r10;
        if (providerInfo == null) {
            A1A = AnonymousClass7TE.A1A();
            A1A.append("Could not retrieve provider info for ");
            A1A.append(str);
        } else {
            this.A03 = providerInfo.grantUriPermissions;
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "com.facebook.secure.fileprovider.SECURE_FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                A1A = AnonymousClass7TE.A1A();
                A1A.append("Could not read ");
                A1A.append("com.facebook.secure.fileprovider.SECURE_FILE_PROVIDER_PATHS");
                A1A.append(" meta-data");
            } else {
                LinkedList linkedList = new LinkedList();
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1) {
                        A12 = C66580MXl.A12(linkedList);
                        break;
                    } else if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        if ("paths".equals(name)) {
                            continue;
                        } else {
                            MY4 my4 = (MY4) MY4.A03.get(name);
                            if (my4 != null) {
                                linkedList.add(new MY6(my4, loadXmlMetaData.getAttributeValue((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), loadXmlMetaData.getAttributeValue((String) null, "path")));
                            } else {
                                throw AnonymousClass7TF.A0W("Unrecognized storage root ", name);
                            }
                        }
                    }
                }
                this.A05 = A12;
            }
        }
        r10.EFT("SecureRootPathManager", A1A.toString(), (Throwable) null);
        A12 = AnonymousClass7TE.A1F();
        this.A05 = A12;
    }

    public static void A00(MY5 my5) {
        if (!my5.A00) {
            HashMap hashMap = my5.A02;
            synchronized (hashMap) {
                if (!my5.A00) {
                    Iterator it = my5.A05.iterator();
                    while (it.hasNext()) {
                        MY6 my6 = (MY6) it.next();
                        String str = my6.A01;
                        File A002 = my6.A00.A00(my5.A04);
                        String str2 = new String[]{my6.A02}[0];
                        if (str2 != null) {
                            String trim = str2.trim();
                            if (trim.trim().length() != 0) {
                                A002 = JTO.A0s(A002, trim);
                            }
                        }
                        if (str == null || str.trim().length() == 0) {
                            my5.A01.EFT("SecureRootPathManager", "Path names may not be empty", (Throwable) null);
                        } else {
                            hashMap.put(str, A002.getCanonicalFile());
                        }
                    }
                    my5.A00 = true;
                }
            }
        }
    }
}
