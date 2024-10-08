package androidx.sharetarget;

import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10150RnR;
import X.C10518RtX;
import X.C13158TNq;
import X.C66773McJ;
import X.Pxe;
import X.Pxf;
import X.PzA;
import X.PzC;
import X.SCS;
import X.TA6;
import X.TNT;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.chooser.ChooserTarget;
import android.service.chooser.ChooserTargetService;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.direct.realtime.armadilloexpress.plugins.backupupdategenerator.IGBackupUpdateGeneratorPluginImplPostmailbox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ChooserTargetServiceCompat extends ChooserTargetService {
    public List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        IconCompat iconCompat;
        Bitmap bitmap;
        C10518RtX rtX;
        Context applicationContext = getApplicationContext();
        if (SCS.A01 == null) {
            synchronized (SCS.A00) {
                if (SCS.A01 == null) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Intent A0G = Pxe.A0G(AnonymousClass000.A00(129));
                    A0G.addCategory(AnonymousClass000.A00(503));
                    Pxe.A1L(applicationContext, A0G);
                    List<ResolveInfo> queryIntentActivities = applicationContext.getPackageManager().queryIntentActivities(A0G, 128);
                    if (queryIntentActivities != null) {
                        for (ResolveInfo resolveInfo : queryIntentActivities) {
                            ActivityInfo activityInfo = resolveInfo.activityInfo;
                            Bundle bundle = activityInfo.metaData;
                            if (bundle != null && bundle.containsKey("android.app.shortcuts")) {
                                ArrayList A1C2 = AnonymousClass7TE.A1C();
                                XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(applicationContext.getPackageManager(), "android.app.shortcuts");
                                if (loadXmlMetaData == null) {
                                    throw AnonymousClass7TF.A0W("Failed to open android.app.shortcuts meta-data resource of ", activityInfo.name);
                                }
                                while (true) {
                                    try {
                                        int next = loadXmlMetaData.next();
                                        if (next == 1) {
                                            break;
                                        } else if (next == 2 && loadXmlMetaData.getName().equals("share-target")) {
                                            String A00 = SCS.A00(loadXmlMetaData, "targetClass");
                                            ArrayList A1C3 = AnonymousClass7TE.A1C();
                                            ArrayList A1C4 = AnonymousClass7TE.A1C();
                                            while (true) {
                                                int next2 = loadXmlMetaData.next();
                                                if (next2 != 1) {
                                                    if (next2 != 2) {
                                                        if (next2 == 3 && loadXmlMetaData.getName().equals("share-target")) {
                                                            break;
                                                        }
                                                    } else {
                                                        String name = loadXmlMetaData.getName();
                                                        if (name.equals("data")) {
                                                            SCS.A00(loadXmlMetaData, "scheme");
                                                            SCS.A00(loadXmlMetaData, "host");
                                                            SCS.A00(loadXmlMetaData, TraceFieldType.Port);
                                                            SCS.A00(loadXmlMetaData, "path");
                                                            SCS.A00(loadXmlMetaData, "pathPattern");
                                                            SCS.A00(loadXmlMetaData, "pathPrefix");
                                                            A1C3.add(new C10150RnR(SCS.A00(loadXmlMetaData, IGBackupUpdateGeneratorPluginImplPostmailbox.KEY_MIME_TYPE)));
                                                        } else if (name.equals("category")) {
                                                            A1C4.add(SCS.A00(loadXmlMetaData, PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
                                                        }
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                            if (A1C3.isEmpty() || A00 == null || A1C4.isEmpty()) {
                                                rtX = null;
                                            } else {
                                                rtX = new C10518RtX(A00, (C10150RnR[]) A1C3.toArray(new C10150RnR[A1C3.size()]), Pxf.A1a(A1C4, A1C4.size()));
                                            }
                                            if (rtX != null) {
                                                A1C2.add(rtX);
                                            }
                                        }
                                    } catch (Exception e) {
                                        Log.e("ShareTargetXmlParser", "Failed to parse the Xml resource: ", e);
                                    }
                                }
                                loadXmlMetaData.close();
                                A1C.addAll(A1C2);
                            }
                        }
                    }
                    SCS.A01 = A1C;
                }
            }
        }
        ArrayList arrayList = SCS.A01;
        ArrayList A1C5 = AnonymousClass7TE.A1C();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C10518RtX rtX2 = (C10518RtX) it.next();
            if (rtX2.A00.equals(componentName.getClassName())) {
                C10150RnR[] rnRArr = rtX2.A01;
                int length = rnRArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (intentFilter.hasDataType(rnRArr[i].A00)) {
                        A1C5.add(rtX2);
                        break;
                    }
                    i++;
                }
            }
        }
        if (!A1C5.isEmpty()) {
            ShortcutInfoCompatSaverImpl instance = ShortcutInfoCompatSaverImpl.getInstance(applicationContext);
            try {
                List<PzA> A02 = instance.A02();
                if (A02 != null && !A02.isEmpty()) {
                    ArrayList A1C6 = AnonymousClass7TE.A1C();
                    for (PzA pzA : A02) {
                        Iterator it2 = A1C5.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C10518RtX rtX3 = (C10518RtX) it2.next();
                            if (pzA.A0F.containsAll(Arrays.asList(rtX3.A02))) {
                                A1C6.add(new TA6(new ComponentName(applicationContext.getPackageName(), rtX3.A00), pzA));
                                break;
                            }
                        }
                    }
                    if (A1C6.isEmpty()) {
                        return AnonymousClass7TE.A1C();
                    }
                    Collections.sort(A1C6);
                    ArrayList A1C7 = AnonymousClass7TE.A1C();
                    float f = 1.0f;
                    int i2 = ((TA6) A1C6.get(0)).A01.A02;
                    Iterator it3 = A1C6.iterator();
                    while (it3.hasNext()) {
                        TA6 ta6 = (TA6) it3.next();
                        PzA pzA2 = ta6.A01;
                        Icon icon = null;
                        try {
                            PzC pzC = (PzC) instance.A05.submit(new TNT(pzA2.A0D, instance, 0)).get();
                            iconCompat = null;
                            if (pzC != null) {
                                String str = pzC.A02;
                                if (!TextUtils.isEmpty(str)) {
                                    int i3 = 0;
                                    try {
                                        i3 = instance.A00.getResources().getIdentifier(str, (String) null, (String) null);
                                    } catch (Exception unused) {
                                    }
                                    if (i3 != 0) {
                                        iconCompat = IconCompat.A00(instance.A00, i3);
                                    }
                                }
                                if (!TextUtils.isEmpty(pzC.A01) && (bitmap = (Bitmap) instance.A06.submit(new C13158TNq(0, instance, pzC)).get()) != null) {
                                    iconCompat = IconCompat.A02(bitmap);
                                }
                            }
                        } catch (Exception e2) {
                            Log.e("ChooserServiceCompat", "Failed to retrieve shortcut icon: ", e2);
                            iconCompat = null;
                        }
                        Bundle A0a = AnonymousClass7TE.A0a();
                        A0a.putString("android.intent.extra.shortcut.ID", pzA2.A0D);
                        int i4 = pzA2.A02;
                        if (i2 != i4) {
                            f -= 0.01f;
                            i2 = i4;
                        }
                        CharSequence charSequence = pzA2.A0B;
                        if (iconCompat != null) {
                            icon = C66773McJ.A00((Context) null, iconCompat);
                        }
                        A1C7.add(new ChooserTarget(charSequence, icon, f, ta6.A00, A0a));
                    }
                    return A1C7;
                }
            } catch (Exception e3) {
                Log.e("ChooserServiceCompat", "Failed to retrieve shortcuts: ", e3);
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }
}
