package com.instagram.debug.devoptions.zero;

import X.0qQ;
import X.0rw;
import X.19B;
import X.1Eo;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0fN;
import X.AnonymousClass12T;
import X.AnonymousClass2Q8;
import X.AnonymousClass4D7;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C17742VdB;
import X.C18080Vl9;
import X.C227642jf;
import X.C262224Cq;
import X.C47518E6c;
import X.C50989Fmc;
import X.C51967G9n;
import X.C66583MXo;
import X.C71079Oay;
import X.DbW;
import X.DbY;
import X.OL0;
import X.OYZ;
import android.os.Bundle;
import android.view.View;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.zero.headers.IGZeroHeadersConfigFetch;
import com.instagram.zero.headers.IGZeroHeadersPing;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import libraries.zero.headers.ZeroHeadersEntry;

public final class ZeroHeadersDevOptionsFragment extends C47518E6c implements AnonymousClass4DS {
    public IGZeroHeadersConfigFetch configFetch;
    public ArrayList items;
    public OL0 logger;
    public final String moduleName = "ZeroHeadersDevOptionsFragment";
    public IGZeroHeadersPing ping;
    public C262224Cq scope;
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);
    public OYZ storage;

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "Zero Headers Settings");
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ArrayList arrayList = this.items;
        if (arrayList == null) {
            0qQ.A0F(DialogModule.KEY_ITEMS);
            throw AnonymousClass00P.createAndThrow();
        } else {
            setItems(arrayList);
        }
    }

    /* access modifiers changed from: private */
    public final void onLoadLatestEntry() {
        OYZ oyz = this.storage;
        if (oyz == null) {
            0qQ.A0F("storage");
            throw AnonymousClass00P.createAndThrow();
        }
        String[] strArr = (String[]) OYZ.A00(oyz).keySet().toArray(new String[0]);
        C18080Vl9 vl9 = new C18080Vl9(requireContext());
        vl9.A08("Choose Storage");
        ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1 zeroHeadersDevOptionsFragment$onLoadLatestEntry$1 = new ZeroHeadersDevOptionsFragment$onLoadLatestEntry$1(this, strArr);
        C17742VdB vdB = vl9.A01;
        vdB.A0J = strArr;
        vdB.A03 = zeroHeadersDevOptionsFragment$onLoadLatestEntry$1;
        AnonymousClass0fN.A00(vl9.A00());
    }

    /* access modifiers changed from: private */
    public final void onStartHeadersFlow(UserSession userSession) {
        String str;
        IGZeroHeadersConfigFetch iGZeroHeadersConfigFetch = this.configFetch;
        if (iGZeroHeadersConfigFetch == null) {
            str = "configFetch";
        } else {
            IGZeroHeadersPing iGZeroHeadersPing = this.ping;
            if (iGZeroHeadersPing == null) {
                str = "ping";
            } else {
                OYZ oyz = this.storage;
                if (oyz == null) {
                    str = "storage";
                } else {
                    OL0 ol0 = this.logger;
                    if (ol0 == null) {
                        str = "logger";
                    } else {
                        C71079Oay oay = new C71079Oay(iGZeroHeadersConfigFetch, ol0, iGZeroHeadersPing, oyz);
                        C262224Cq r2 = this.scope;
                        str = "scope";
                        if (r2 != null) {
                            ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1 zeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1 = new ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1(oay, (AnonymousClass4D7) null);
                            19B r0 = 19B.A00;
                            Integer num = AnonymousClass05K.A00;
                            AnonymousClass2Q8 A01 = 1Eo.A01(num, r0, zeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1, r2);
                            C262224Cq r22 = this.scope;
                            if (r22 != null) {
                                1Eo.A03(num, AnonymousClass12T.A00.A04, new ZeroHeadersDevOptionsFragment$onStartHeadersFlow$1(A01, this, (AnonymousClass4D7) null), r22);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* access modifiers changed from: private */
    public final String turnEntryToString(ZeroHeadersEntry zeroHeadersEntry) {
        if (zeroHeadersEntry == null) {
            return "null";
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("\n      Entry Fetched: {\n        Carrier ID: ");
        A1A.append(zeroHeadersEntry.A00);
        A1A.append(",\n        Masked MSISDN: ");
        A1A.append(zeroHeadersEntry.A04);
        A1A.append(",\n        Created At: ");
        A1A.append(Instant.ofEpochSecond((long) zeroHeadersEntry.A01).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        A1A.append(",\n        Expires At: ");
        A1A.append(Instant.ofEpochSecond((long) zeroHeadersEntry.A02).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        A1A.append(",\n        Encrypted MSISDN: ");
        A1A.append(C51967G9n.A0q(zeroHeadersEntry.A03, 0, 8));
        return 0rw.A0t(AnonymousClass7TF.A0l("...,\n      }", A1A));
    }

    public String getModuleName() {
        return this.moduleName;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.zero.headers.IGZeroHeadersPing, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(168185771);
        super.onCreate(bundle);
        this.configFetch = new IGZeroHeadersConfigFetch(AnonymousClass7TE.A0l(this.session$delegate));
        this.ping = new Object();
        this.storage = new OYZ(AnonymousClass7TE.A0l(this.session$delegate));
        this.logger = new OL0(AnonymousClass7TE.A0l(this.session$delegate));
        this.scope = DbY.A0r(AnonymousClass12T.A00, 197189788);
        this.items = AnonymousClass7TE.A1C();
        C50989Fmc fmc = new C50989Fmc(requireContext(), (View.OnClickListener) new ZeroHeadersDevOptionsFragment$onCreate$forceHeadersPingItem$1(this), (CharSequence) "Force Headers Ping");
        ArrayList arrayList = this.items;
        if (arrayList != null) {
            C50989Fmc fmc2 = new C50989Fmc(C66583MXo.A07(this, fmc, arrayList), (View.OnClickListener) new ZeroHeadersDevOptionsFragment$onCreate$getLatestHeadersEntry$1(this), (CharSequence) "Get Latest Headers Entry");
            ArrayList arrayList2 = this.items;
            if (arrayList2 != null) {
                C50989Fmc fmc3 = new C50989Fmc(C66583MXo.A07(this, fmc2, arrayList2), (View.OnClickListener) new ZeroHeadersDevOptionsFragment$onCreate$clearHeadersStorage$1(this), (CharSequence) "Clear Headers Storage");
                ArrayList arrayList3 = this.items;
                if (arrayList3 != null) {
                    arrayList3.add(fmc3);
                    AnonymousClass0fD.A09(1677614138, A02);
                    return;
                }
            }
        }
        0qQ.A0F(DialogModule.KEY_ITEMS);
        throw AnonymousClass00P.createAndThrow();
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
