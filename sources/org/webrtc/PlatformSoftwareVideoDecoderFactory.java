package org.webrtc;

import android.media.MediaCodecInfo;
import java.util.Map;
import org.webrtc.EglBase;
import org.webrtc.Predicate;

public class PlatformSoftwareVideoDecoderFactory extends MediaCodecVideoDecoderFactory {
    public static final Predicate defaultAllowedPredicate = new Predicate() {
        public /* synthetic */ Predicate and(Predicate predicate) {
            return new Predicate.AnonymousClass2(predicate);
        }

        public /* synthetic */ Predicate negate() {
            return new Predicate() {
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return new AnonymousClass2(predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: RETURN  
                          (wrap: org.webrtc.Predicate$3 : 0x0002: CONSTRUCTOR  (r0v0 org.webrtc.Predicate$3) = 
                          (r1v0 'this' org.webrtc.PlatformSoftwareVideoDecoderFactory$1 A[THIS])
                         call: org.webrtc.Predicate.3.<init>(org.webrtc.Predicate):void type: CONSTRUCTOR)
                         in method: org.webrtc.PlatformSoftwareVideoDecoderFactory.1.negate():org.webrtc.Predicate, dex: classes11.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
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
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:98)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:480)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.ClassGen.addInsnBody(ClassGen.java:437)
                        	at jadx.core.codegen.ClassGen.addField(ClassGen.java:378)
                        	at jadx.core.codegen.ClassGen.addFields(ClassGen.java:348)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 org.webrtc.Predicate$3) = 
                          (r1v0 'this' org.webrtc.PlatformSoftwareVideoDecoderFactory$1 A[THIS])
                         call: org.webrtc.Predicate.3.<init>(org.webrtc.Predicate):void type: CONSTRUCTOR in method: org.webrtc.PlatformSoftwareVideoDecoderFactory.1.negate():org.webrtc.Predicate, dex: classes11.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 42 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:274)
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
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 46 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0005: RETURN  
                          (wrap: org.webrtc.Predicate$3 : 0x0002: CONSTRUCTOR  (r0v0 org.webrtc.Predicate$3) = (r1v0 'this' org.webrtc.Predicate$3 A[THIS]) call: org.webrtc.Predicate.3.<init>(org.webrtc.Predicate):void type: CONSTRUCTOR)
                         in method: org.webrtc.Predicate.3.negate():org.webrtc.Predicate, dex: classes11.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	... 63 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 org.webrtc.Predicate$3) = (r1v0 'this' org.webrtc.Predicate$3 A[THIS]) call: org.webrtc.Predicate.3.<init>(org.webrtc.Predicate):void type: CONSTRUCTOR in method: org.webrtc.Predicate.3.negate():org.webrtc.Predicate, dex: classes11.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 72 more
                        Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: org.webrtc.Predicate.3
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	... 76 more
                        */
                    /*
                        this = this;
                        org.webrtc.Predicate$3 r0 = new org.webrtc.Predicate$3
                        r0.<init>()
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: org.webrtc.PlatformSoftwareVideoDecoderFactory.AnonymousClass1.negate():org.webrtc.Predicate");
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return new Predicate.AnonymousClass1(predicate);
                }

                public /* bridge */ /* synthetic */ boolean test(Object obj) {
                    return MediaCodecUtils.isSoftwareOnly((MediaCodecInfo) obj);
                }

                public boolean test(MediaCodecInfo mediaCodecInfo) {
                    return MediaCodecUtils.isSoftwareOnly(mediaCodecInfo);
                }
            };

            public PlatformSoftwareVideoDecoderFactory(EglBase.Context context) {
                super(context, defaultAllowedPredicate);
            }

            public /* bridge */ /* synthetic */ VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
                return super.createDecoder(videoCodecInfo);
            }

            public /* bridge */ /* synthetic */ VideoCodecInfo[] getSupportedCodecs() {
                return super.getSupportedCodecs();
            }

            public PlatformSoftwareVideoDecoderFactory(EglBase.Context context, Map map) {
                super(context, defaultAllowedPredicate, map);
            }
        }
