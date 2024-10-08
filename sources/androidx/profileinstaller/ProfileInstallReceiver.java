package androidx.profileinstaller;

import X.08C;
import X.08G;
import X.C11757Sfs;
import X.C265664Vr;
import X.C66580MXl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

public class ProfileInstallReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        C11757Sfs sfs;
        Object obj;
        int i;
        C265664Vr r5;
        C11757Sfs sfs2;
        Object obj2;
        int i2;
        int i3;
        int A03 = C66580MXl.A03(this, context, intent, -1193999392);
        if (intent == null) {
            i3 = 773008244;
        } else {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                08G.A00(context, new C11757Sfs(this), new C265664Vr(), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        r5 = new C265664Vr();
                        sfs2 = new C11757Sfs(this);
                        try {
                            08G.A01(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                            obj2 = null;
                            i2 = 10;
                        } catch (PackageManager.NameNotFoundException e) {
                            r5.execute(new 08C(sfs2, e, 7));
                        }
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        new C265664Vr
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0085: CONSTRUCTOR  (r5v1 ? I:X.4Vr) =  call: X.4Vr.<init>():void type: CONSTRUCTOR in method: androidx.profileinstaller.ProfileInstallReceiver.onReceive(android.content.Context, android.content.Intent):void, dex: classes10.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v1 ?
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	... 53 more
                            */
                        /*
                            this = this;
                            r0 = -1193999392(0xffffffffb8d503e0, float:-1.0157353E-4)
                            int r2 = X.C66580MXl.A03(r6, r7, r8, r0)
                            if (r8 != 0) goto L_0x0010
                            r0 = 773008244(0x2e132b74, float:3.3462524E-11)
                        L_0x000c:
                            X.AnonymousClass0fD.A0E(r0, r2, r8)
                            return
                        L_0x0010:
                            java.lang.String r1 = r8.getAction()
                            java.lang.String r0 = "androidx.profileinstaller.action.INSTALL_PROFILE"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L_0x002e
                            X.4Vr r3 = new X.4Vr
                            r3.<init>()
                            X.Sfs r1 = new X.Sfs
                            r1.<init>(r6)
                            r0 = 1
                            X.08G.A00(r7, r1, r3, r0)
                        L_0x002a:
                            r0 = -1179851166(0xffffffffb9ace662, float:-3.2978045E-4)
                            goto L_0x000c
                        L_0x002e:
                            java.lang.String r0 = "androidx.profileinstaller.action.SKIP_FILE"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L_0x00a7
                            android.os.Bundle r1 = r8.getExtras()
                            if (r1 == 0) goto L_0x002a
                            java.lang.String r0 = "EXTRA_SKIP_FILE_OPERATION"
                            java.lang.String r1 = r1.getString(r0)
                            java.lang.String r0 = "WRITE_SKIP_FILE"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L_0x007b
                            X.4Vr r5 = new X.4Vr
                            r5.<init>()
                            X.Sfs r4 = new X.Sfs
                            r4.<init>(r6)
                            android.content.Context r0 = r7.getApplicationContext()
                            java.lang.String r3 = r0.getPackageName()
                            android.content.pm.PackageManager r1 = r7.getPackageManager()
                            r0 = 0
                            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r0)     // Catch:{ NameNotFoundException -> 0x0070 }
                            java.io.File r0 = r7.getFilesDir()
                            X.08G.A01(r1, r0)
                            r3 = 0
                            r1 = 10
                            goto L_0x009e
                        L_0x0070:
                            r3 = move-exception
                            r1 = 7
                            X.08C r0 = new X.08C
                            r0.<init>(r4, r3, r1)
                            r5.execute(r0)
                            goto L_0x002a
                        L_0x007b:
                            java.lang.String r0 = "DELETE_SKIP_FILE"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L_0x002a
                            X.4Vr r5 = new X.4Vr
                            r5.<init>()
                            X.Sfs r4 = new X.Sfs
                            r4.<init>(r6)
                            java.io.File r1 = r7.getFilesDir()
                            java.lang.String r0 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
                            java.io.File r0 = X.JTO.A0s(r1, r0)
                            r0.delete()
                            r3 = 0
                            r1 = 11
                        L_0x009e:
                            X.08C r0 = new X.08C
                            r0.<init>(r4, r3, r1)
                            r5.execute(r0)
                            goto L_0x002a
                        L_0x00a7:
                            java.lang.String r0 = "androidx.profileinstaller.action.SAVE_PROFILE"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L_0x00c5
                            X.Sfs r3 = new X.Sfs
                            r3.<init>(r6)
                            r4 = 0
                            int r1 = android.os.Process.myPid()
                            r0 = 10
                            android.os.Process.sendSignal(r1, r0)
                            r1 = 12
                        L_0x00c0:
                            r3.DfY(r1, r4)
                            goto L_0x002a
                        L_0x00c5:
                            java.lang.String r0 = "androidx.profileinstaller.action.BENCHMARK_OPERATION"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L_0x002a
                            android.os.Bundle r1 = r8.getExtras()
                            if (r1 == 0) goto L_0x002a
                            java.lang.String r0 = "EXTRA_BENCHMARK_OPERATION"
                            java.lang.String r1 = r1.getString(r0)
                            X.Sfs r3 = new X.Sfs
                            r3.<init>(r6)
                            java.lang.String r0 = "DROP_SHADER_CACHE"
                            boolean r0 = r0.equals(r1)
                            if (r0 == 0) goto L_0x00fa
                            android.content.Context r0 = r7.createDeviceProtectedStorageContext()
                            java.io.File r0 = r0.getCodeCacheDir()
                            boolean r0 = X.RS8.A00(r0)
                            r4 = 0
                            r1 = 15
                            if (r0 == 0) goto L_0x00c0
                            r1 = 14
                            goto L_0x00c0
                        L_0x00fa:
                            r1 = 16
                            r0 = 0
                            r3.DfY(r1, r0)
                            goto L_0x002a
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.ProfileInstallReceiver.onReceive(android.content.Context, android.content.Intent):void");
                    }
                }
