package com.instagram.debug.devoptions.sandboxselector;

import X.002;
import X.00k;
import X.00l;
import X.01N;
import X.0jo;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C56078HsR;
import com.instagram.debug.devoptions.sandboxselector.DevserverListError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class SandboxDataModelConverterKt {
    public static final String PRODUCTION_DESCRIPTION = "Routes to prod - will pick a random routing pool";
    public static final String PROD_DOMAIN = "prod.instagram.com";
    public static final String SANDBOX_SUBDOMAIN_DEDICATED = ".devvm";
    public static final String SANDBOX_SUBDOMAIN_ON_DEMAND = ".od";

    public static final Sandbox hostNameToSandbox(String str, String str2) {
        AnonymousClass7TF.A1H(str, str2);
        return new Sandbox(str, hostNameToSandboxType(str, str2), "", false);
    }

    public static final SandboxErrorInfo toSandboxError(DevserverListError.HttpError httpError) {
        0qQ.A0B(httpError, 0);
        int i = httpError.statusCode;
        if (i == 404) {
            return new SandboxErrorInfo(new C56078HsR(new Object[0], 2131958240), new C56078HsR(new Object[0], 2131958239), "User is not an employee");
        }
        return new SandboxErrorInfo(new C56078HsR(new Object[0], 2131958236), new C56078HsR(new Object[]{Integer.valueOf(i), String.valueOf(httpError.errorMessage)}, 2131958235), 002.A05(httpError.statusCode, "HTTP error ", " : ", httpError.errorMessage));
    }

    public static final List toSandboxes(List list, String str, String str2) {
        AnonymousClass7TF.A1B(list, 0, str2);
        01N A1H = 0jo.A1H();
        A1H.add(new Sandbox(str2, SandboxType.PRODUCTION, PRODUCTION_DESCRIPTION, true));
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DevServerEntity devServerEntity = (DevServerEntity) it.next();
            A0r.add(new Sandbox(devServerEntity.url, getSandboxType(devServerEntity), devServerEntity.description, devServerEntity.supportsVpnless));
        }
        A1H.addAll(00k.A0g(A0r, new SandboxDataModelConverterKt$toSandboxes$lambda$3$$inlined$sortedBy$1()));
        if (str != null) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (0qQ.A0K(((DevServerEntity) it2.next()).url, str)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            A1H.add(new Sandbox(str, SandboxType.OTHER, "", false));
        }
        return 0jo.A1I(A1H);
    }

    public static final SandboxType getSandboxType(DevServerEntity devServerEntity) {
        String str = devServerEntity.hostType;
        int hashCode = str.hashCode();
        if (hashCode != -1675226388) {
            if (hashCode != 916067498) {
                if (hashCode == 1726636778 && str.equals("On Demand Instances")) {
                    return SandboxType.ON_DEMAND;
                }
            } else if (str.equals("Production Tiers")) {
                return SandboxType.PRODUCTION;
            }
        } else if (str.equals("Dedicated Devservers")) {
            return SandboxType.DEDICATED;
        }
        return SandboxType.OTHER;
    }

    public static /* synthetic */ Sandbox hostNameToSandbox$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "i.instagram.com";
        }
        return hostNameToSandbox(str, str2);
    }

    public static /* synthetic */ SandboxType hostNameToSandboxType$default(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "i.instagram.com";
        }
        return hostNameToSandboxType(str, str2);
    }

    public static /* synthetic */ List toSandboxes$default(List list, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "i.instagram.com";
        }
        return toSandboxes(list, str, str2);
    }

    public static final SandboxType hostNameToSandboxType(String str, String str2) {
        if (0qQ.A0K(str, str2) || 00l.A0d(str, PROD_DOMAIN, false)) {
            return SandboxType.PRODUCTION;
        }
        if (00l.A0d(str, SANDBOX_SUBDOMAIN_ON_DEMAND, false)) {
            return SandboxType.ON_DEMAND;
        }
        if (00l.A0d(str, SANDBOX_SUBDOMAIN_DEDICATED, false)) {
            return SandboxType.DEDICATED;
        }
        return SandboxType.OTHER;
    }

    public static final SandboxErrorInfo toSandboxError(DevserverListError devserverListError) {
        0qQ.A0B(devserverListError, 0);
        if (devserverListError instanceof DevserverListError.ConnectionError) {
            return new SandboxErrorInfo(new C56078HsR(new Object[0], 2131958238), new C56078HsR(new Object[0], 2131958237), "Connection error");
        }
        if (devserverListError instanceof DevserverListError.HttpError) {
            return toSandboxError((DevserverListError.HttpError) devserverListError);
        }
        throw AnonymousClass7TE.A1K();
    }
}
