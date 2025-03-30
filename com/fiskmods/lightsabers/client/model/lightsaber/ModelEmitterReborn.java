package com.fiskmods.lightsabers.client.model.lightsaber;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEmitterReborn extends ModelBase
{
    public ModelRenderer body1;
    public ModelRenderer innerRing1;
    public ModelRenderer emitterTip1;
    public ModelRenderer sideRing3;
    public ModelRenderer sideRing2;
    public ModelRenderer sideRing1;
    public ModelRenderer sideRing4;
    public ModelRenderer darkInnerRing1;
    public ModelRenderer sideBlade1point1;
    public ModelRenderer sideBlade1point2;
    public ModelRenderer sideBlade1point3;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body10;
    public ModelRenderer body11;
    public ModelRenderer body12;
    public ModelRenderer body14;
    public ModelRenderer body16;
    public ModelRenderer innerRing2;
    public ModelRenderer innerRing3;
    public ModelRenderer innerRing4;
    public ModelRenderer innerRing5;
    public ModelRenderer innerRing6;
    public ModelRenderer innerRing7;
    public ModelRenderer innerRing8;
    public ModelRenderer innerRing9;
    public ModelRenderer emitterTip2;
    public ModelRenderer emitterTip3;
    public ModelRenderer emitterTip4;
    public ModelRenderer emitterTip5;
    public ModelRenderer emitterTip6;
    public ModelRenderer emitterTip7;
    public ModelRenderer emitterTip8;
    public ModelRenderer topRing2;
    public ModelRenderer topRing3;
    public ModelRenderer topRing4;
    public ModelRenderer topRing5;
    public ModelRenderer topRing6;
    public ModelRenderer topRing7;
    public ModelRenderer topRing8;
    public ModelRenderer topRing2_1;
    public ModelRenderer topRing3_1;
    public ModelRenderer topRing4_1;
    public ModelRenderer topRing5_1;
    public ModelRenderer topRing6_1;
    public ModelRenderer topRing7_1;
    public ModelRenderer topRing8_1;
    public ModelRenderer topRing2_2;
    public ModelRenderer topRing3_2;
    public ModelRenderer topRing4_2;
    public ModelRenderer topRing5_2;
    public ModelRenderer topRing6_2;
    public ModelRenderer topRing7_2;
    public ModelRenderer topRing8_2;
    public ModelRenderer topRing2_3;
    public ModelRenderer topRing3_3;
    public ModelRenderer topRing4_3;
    public ModelRenderer topRing5_3;
    public ModelRenderer topRing6_3;
    public ModelRenderer topRing7_3;
    public ModelRenderer topRing8_3;
    public ModelRenderer darkInnerRing2;
    public ModelRenderer darkInnerRing3;
    public ModelRenderer darkInnerRing4;
    public ModelRenderer darkInnerRing5;
    public ModelRenderer darkInnerRing6;
    public ModelRenderer darkInnerRing7;
    public ModelRenderer darkInnerRing8;
    public ModelRenderer sideBlade2;
    public ModelRenderer sideBlade3;
    public ModelRenderer sideBlade2_1;
    public ModelRenderer sideBlade3_1;
    public ModelRenderer sideBlade2_2;
    public ModelRenderer sideBlade3_2;

    public ModelEmitterReborn()
    {
        textureWidth = 32;
        textureHeight = 32;
        sideBlade1point1 = new ModelRenderer(this, 0, 11);
        sideBlade1point1.setRotationPoint(2.3F, -18.0F, -2.8F);
        sideBlade1point1.addBox(0.0F, 0.0F, 0.0F, 1, 18, 1, 0.0F);
        setRotateAngle(sideBlade1point1, 0.0F, 0.7853981633974483F, 0.0F);
        innerRing7 = new ModelRenderer(this, 0, 0);
        innerRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing7.addBox(-1.5F, -2.0F, 3.67F, 3, 2, 1, 0.0F);
        setRotateAngle(innerRing7, 0.46949356878647464F, -2.356194490192345F, 0.0F);
        topRing6_2 = new ModelRenderer(this, 16, 14);
        topRing6_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing6_2.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing6_2, 0.0F, -2.356194490192345F, 0.0F);
        body16 = new ModelRenderer(this, 0, 0);
        body16.mirror = true;
        body16.setRotationPoint(0.0F, 0.0F, 0.0F);
        body16.addBox(-1.5F, -10.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(body16, 0.0F, 2.356194490192345F, 0.0F);
        innerRing3 = new ModelRenderer(this, 0, 0);
        innerRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing3.addBox(-1.5F, -2.0F, 3.67F, 3, 2, 1, 0.0F);
        setRotateAngle(innerRing3, 0.46949356878647464F, 0.7853981633974483F, 0.0F);
        emitterTip5 = new ModelRenderer(this, 16, 25);
        emitterTip5.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterTip5.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(emitterTip5, 0.0F, 3.141592653589793F, 0.0F);
        topRing7_2 = new ModelRenderer(this, 16, 14);
        topRing7_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing7_2.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing7_2, 0.0F, -1.5707963267948966F, 0.0F);
        darkInnerRing2 = new ModelRenderer(this, 0, 0);
        darkInnerRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing2.addBox(-1.5F, -2.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(darkInnerRing2, 0.0F, 0.7853981633974483F, 0.0F);
        innerRing1 = new ModelRenderer(this, 0, 10);
        innerRing1.setRotationPoint(0.0F, -8.74F, 0.0F);
        innerRing1.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0, 0.0F);
        topRing4_2 = new ModelRenderer(this, 16, 14);
        topRing4_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing4_2.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing4_2, 0.0F, 2.356194490192345F, 0.0F);
        darkInnerRing7 = new ModelRenderer(this, 0, 0);
        darkInnerRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing7.addBox(-1.5F, -2.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(darkInnerRing7, 0.0F, -1.5707963267948966F, 0.0F);
        topRing2 = new ModelRenderer(this, 16, 21);
        topRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing2, 0.0F, 0.7853981633974483F, 0.0F);
        topRing8_1 = new ModelRenderer(this, 16, 21);
        topRing8_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing8_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing8_1, 0.0F, -0.7853981633974483F, 0.0F);
        sideRing3 = new ModelRenderer(this, 16, 21);
        sideRing3.setRotationPoint(0.0F, -3.0F, 0.0F);
        sideRing3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        emitterTip7 = new ModelRenderer(this, 16, 25);
        emitterTip7.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterTip7.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(emitterTip7, 0.0F, -1.5707963267948966F, 0.0F);
        innerRing4 = new ModelRenderer(this, 0, 0);
        innerRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing4.addBox(-1.5F, -2.0F, 3.67F, 3, 2, 1, 0.0F);
        setRotateAngle(innerRing4, 0.46949356878647464F, 1.5707963267948966F, 0.0F);
        sideBlade2 = new ModelRenderer(this, 0, 11);
        sideBlade2.setRotationPoint(0.9F, 0.0F, 0.0F);
        sideBlade2.addBox(0.0F, 5.0F, 0.0F, 1, 13, 1, 0.0F);
        body2 = new ModelRenderer(this, 0, 0);
        body2.mirror = true;
        body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body2.addBox(-1.5F, -10.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        topRing2_2 = new ModelRenderer(this, 16, 14);
        topRing2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing2_2.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing2_2, 0.0F, 0.7853981633974483F, 0.0F);
        innerRing8 = new ModelRenderer(this, 0, 0);
        innerRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing8.addBox(-1.5F, -2.0F, 3.67F, 3, 2, 1, 0.0F);
        setRotateAngle(innerRing8, 0.46949356878647464F, -1.5707963267948966F, 0.0F);
        emitterTip4 = new ModelRenderer(this, 16, 25);
        emitterTip4.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterTip4.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(emitterTip4, 0.0F, 2.356194490192345F, 0.0F);
        innerRing6 = new ModelRenderer(this, 0, 0);
        innerRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing6.addBox(-1.5F, -2.0F, 3.67F, 3, 2, 1, 0.0F);
        setRotateAngle(innerRing6, 0.46949356878647464F, 3.141592653589793F, 0.0F);
        body1 = new ModelRenderer(this, 0, 0);
        body1.setRotationPoint(0.0F, -0.1F, 0.0F);
        body1.addBox(-1.5F, -10.0F, 2.62F, 3, 10, 1, 0.0F);
        sideBlade1point3 = new ModelRenderer(this, 0, 11);
        sideBlade1point3.setRotationPoint(0.5F, -18.0F, 3.6F);
        sideBlade1point3.addBox(0.0F, 0.0F, 0.0F, 1, 18, 1, 0.0F);
        setRotateAngle(sideBlade1point3, 0.0F, -1.5707963267948966F, 0.0F);
        topRing2_1 = new ModelRenderer(this, 16, 21);
        topRing2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing2_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing2_1, 0.0F, 0.7853981633974483F, 0.0F);
        topRing4 = new ModelRenderer(this, 16, 21);
        topRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing4, 0.0F, 2.356194490192345F, 0.0F);
        emitterTip2 = new ModelRenderer(this, 16, 25);
        emitterTip2.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterTip2.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(emitterTip2, 0.0F, 0.7853981633974483F, 0.0F);
        topRing8_3 = new ModelRenderer(this, 16, 21);
        topRing8_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing8_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing8_3, 0.0F, -0.7853981633974483F, 0.0F);
        emitterTip8 = new ModelRenderer(this, 16, 25);
        emitterTip8.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterTip8.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(emitterTip8, 0.0F, -0.7853981633974483F, 0.0F);
        sideBlade2_1 = new ModelRenderer(this, 0, 11);
        sideBlade2_1.setRotationPoint(0.9F, 0.0F, 0.0F);
        sideBlade2_1.addBox(0.0F, 5.0F, 0.0F, 1, 13, 1, 0.0F);
        emitterTip1 = new ModelRenderer(this, 16, 25);
        emitterTip1.setRotationPoint(0.0F, -13.0F, 0.0F);
        emitterTip1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        topRing6 = new ModelRenderer(this, 16, 21);
        topRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing6.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing6, 0.0F, -2.356194490192345F, 0.0F);
        topRing7_3 = new ModelRenderer(this, 16, 21);
        topRing7_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing7_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing7_3, 0.0F, -1.5707963267948966F, 0.0F);
        topRing5 = new ModelRenderer(this, 16, 21);
        topRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing5.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing5, 0.0F, 3.141592653589793F, 0.0F);
        topRing8_2 = new ModelRenderer(this, 16, 14);
        topRing8_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing8_2.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing8_2, 0.0F, -0.7853981633974483F, 0.0F);
        topRing4_3 = new ModelRenderer(this, 16, 21);
        topRing4_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing4_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing4_3, 0.0F, 2.356194490192345F, 0.0F);
        sideBlade3_1 = new ModelRenderer(this, 0, 11);
        sideBlade3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        sideBlade3_1.addBox(0.0F, 0.3F, 0.0F, 1, 5, 1, 0.0F);
        setRotateAngle(sideBlade3_1, 0.0F, 0.0F, -0.17453292519943295F);
        emitterTip3 = new ModelRenderer(this, 16, 25);
        emitterTip3.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterTip3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(emitterTip3, 0.0F, 1.5707963267948966F, 0.0F);
        emitterTip6 = new ModelRenderer(this, 16, 25);
        emitterTip6.setRotationPoint(0.0F, 0.0F, 0.0F);
        emitterTip6.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(emitterTip6, 0.0F, -2.356194490192345F, 0.0F);
        darkInnerRing8 = new ModelRenderer(this, 16, 0);
        darkInnerRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing8.addBox(-1.5F, -2.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(darkInnerRing8, 0.0F, -0.7853981633974483F, 0.0F);
        body14 = new ModelRenderer(this, 0, 0);
        body14.setRotationPoint(0.0F, 0.0F, 0.0F);
        body14.addBox(-1.5F, -10.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(body14, 0.0F, 3.141592653589793F, 0.0F);
        sideBlade3 = new ModelRenderer(this, 0, 11);
        sideBlade3.setRotationPoint(0.0F, 0.0F, 0.0F);
        sideBlade3.addBox(0.0F, 0.3F, 0.0F, 1, 5, 1, 0.0F);
        setRotateAngle(sideBlade3, 0.0F, 0.0F, -0.17453292519943295F);
        body12 = new ModelRenderer(this, 0, 0);
        body12.setRotationPoint(0.0F, 0.0F, 0.0F);
        body12.addBox(-1.5F, -10.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(body12, 0.0F, -2.356194490192345F, 0.0F);
        topRing6_3 = new ModelRenderer(this, 16, 21);
        topRing6_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing6_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing6_3, 0.0F, -2.356194490192345F, 0.0F);
        topRing3_3 = new ModelRenderer(this, 16, 21);
        topRing3_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing3_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing3_3, 0.0F, 1.5707963267948966F, 0.0F);
        sideBlade1point2 = new ModelRenderer(this, 0, 11);
        sideBlade1point2.setRotationPoint(-2.9F, -18.0F, -2.3F);
        sideBlade1point2.addBox(0.0F, 0.0F, 0.0F, 1, 18, 1, 0.0F);
        setRotateAngle(sideBlade1point2, 0.0F, 2.356194490192345F, 0.0F);
        sideBlade3_2 = new ModelRenderer(this, 0, 11);
        sideBlade3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        sideBlade3_2.addBox(0.0F, 0.3F, 0.0F, 1, 5, 1, 0.0F);
        setRotateAngle(sideBlade3_2, 0.0F, 0.0F, -0.17453292519943295F);
        innerRing2 = new ModelRenderer(this, 0, 0);
        innerRing2.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing2.addBox(-1.5F, -2.0F, 3.67F, 3, 2, 1, 0.0F);
        setRotateAngle(innerRing2, 0.46949356878647464F, 0.0F, 0.0F);
        topRing5_3 = new ModelRenderer(this, 16, 21);
        topRing5_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing5_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing5_3, 0.0F, 3.141592653589793F, 0.0F);
        topRing2_3 = new ModelRenderer(this, 16, 21);
        topRing2_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing2_3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing2_3, 0.0F, 0.7853981633974483F, 0.0F);
        innerRing9 = new ModelRenderer(this, 0, 0);
        innerRing9.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing9.addBox(-1.5F, -2.0F, 3.67F, 3, 2, 1, 0.0F);
        setRotateAngle(innerRing9, 0.46949356878647464F, -0.7853981633974483F, 0.0F);
        topRing8 = new ModelRenderer(this, 16, 21);
        topRing8.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing8.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing8, 0.0F, -0.7853981633974483F, 0.0F);
        darkInnerRing6 = new ModelRenderer(this, 0, 0);
        darkInnerRing6.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing6.addBox(-1.5F, -2.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(darkInnerRing6, 0.0F, -2.356194490192345F, 0.0F);
        topRing4_1 = new ModelRenderer(this, 16, 21);
        topRing4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing4_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing4_1, 0.0F, 2.356194490192345F, 0.0F);
        sideBlade2_2 = new ModelRenderer(this, 0, 11);
        sideBlade2_2.setRotationPoint(0.9F, 0.0F, 0.0F);
        sideBlade2_2.addBox(0.0F, 5.0F, 0.0F, 1, 13, 1, 0.0F);
        topRing7_1 = new ModelRenderer(this, 16, 21);
        topRing7_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing7_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing7_1, 0.0F, -1.5707963267948966F, 0.0F);
        topRing6_1 = new ModelRenderer(this, 16, 21);
        topRing6_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing6_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing6_1, 0.0F, -2.356194490192345F, 0.0F);
        darkInnerRing5 = new ModelRenderer(this, 0, 0);
        darkInnerRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing5.addBox(-1.5F, -2.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(darkInnerRing5, 0.0F, 3.141592653589793F, 0.0F);
        darkInnerRing3 = new ModelRenderer(this, 0, 0);
        darkInnerRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing3.addBox(-1.5F, -2.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(darkInnerRing3, 0.0F, 1.5707963267948966F, 0.0F);
        darkInnerRing1 = new ModelRenderer(this, 0, 0);
        darkInnerRing1.setRotationPoint(0.0F, -12.1F, 0.0F);
        darkInnerRing1.addBox(-1.5F, -2.0F, 1.62F, 3, 2, 2, 0.0F);
        body3 = new ModelRenderer(this, 0, 0);
        body3.mirror = true;
        body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        body3.addBox(-1.5F, -10.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        topRing3 = new ModelRenderer(this, 16, 21);
        topRing3.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing3.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing3, 0.0F, 1.5707963267948966F, 0.0F);
        topRing5_2 = new ModelRenderer(this, 16, 14);
        topRing5_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing5_2.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing5_2, 0.0F, 3.141592653589793F, 0.0F);
        topRing5_1 = new ModelRenderer(this, 16, 21);
        topRing5_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing5_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing5_1, 0.0F, 3.141592653589793F, 0.0F);
        darkInnerRing4 = new ModelRenderer(this, 0, 0);
        darkInnerRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        darkInnerRing4.addBox(-1.5F, -2.0F, 1.62F, 3, 2, 2, 0.0F);
        setRotateAngle(darkInnerRing4, 0.0F, 2.356194490192345F, 0.0F);
        body10 = new ModelRenderer(this, 0, 0);
        body10.setRotationPoint(0.0F, 0.0F, 0.0F);
        body10.addBox(-1.5F, -10.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(body10, 0.0F, -1.5707963267948966F, 0.0F);
        sideRing1 = new ModelRenderer(this, 16, 14);
        sideRing1.setRotationPoint(0.0F, -10.0F, 0.0F);
        sideRing1.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        body11 = new ModelRenderer(this, 0, 0);
        body11.setRotationPoint(0.0F, 0.0F, 0.0F);
        body11.addBox(-1.5F, -10.0F, 2.62F, 3, 10, 1, 0.0F);
        setRotateAngle(body11, 0.0F, -0.7853981633974483F, 0.0F);
        topRing3_1 = new ModelRenderer(this, 16, 21);
        topRing3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing3_1.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing3_1, 0.0F, 1.5707963267948966F, 0.0F);
        topRing7 = new ModelRenderer(this, 16, 21);
        topRing7.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing7.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        setRotateAngle(topRing7, 0.0F, -1.5707963267948966F, 0.0F);
        sideRing2 = new ModelRenderer(this, 16, 21);
        sideRing2.setRotationPoint(0.0F, -6.1F, 0.0F);
        sideRing2.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        topRing3_2 = new ModelRenderer(this, 16, 14);
        topRing3_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        topRing3_2.addBox(-1.5F, -1.0F, 2.62F, 3, 2, 1, 0.0F);
        setRotateAngle(topRing3_2, 0.0F, 1.5707963267948966F, 0.0F);
        sideRing4 = new ModelRenderer(this, 16, 21);
        sideRing4.setRotationPoint(0.0F, 0.0F, 0.0F);
        sideRing4.addBox(-1.5F, -1.0F, 2.62F, 3, 1, 1, 0.0F);
        innerRing5 = new ModelRenderer(this, 0, 0);
        innerRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
        innerRing5.addBox(-1.5F, -2.0F, 3.67F, 3, 2, 1, 0.0F);
        setRotateAngle(innerRing5, 0.46949356878647464F, 2.356194490192345F, 0.0F);
        innerRing1.addChild(innerRing7);
        sideRing1.addChild(topRing6_2);
        body1.addChild(body16);
        innerRing1.addChild(innerRing3);
        emitterTip1.addChild(emitterTip5);
        sideRing1.addChild(topRing7_2);
        darkInnerRing1.addChild(darkInnerRing2);
        sideRing1.addChild(topRing4_2);
        darkInnerRing1.addChild(darkInnerRing7);
        sideRing3.addChild(topRing2);
        sideRing2.addChild(topRing8_1);
        emitterTip1.addChild(emitterTip7);
        innerRing1.addChild(innerRing4);
        sideBlade1point1.addChild(sideBlade2);
        body1.addChild(body2);
        sideRing1.addChild(topRing2_2);
        innerRing1.addChild(innerRing8);
        emitterTip1.addChild(emitterTip4);
        innerRing1.addChild(innerRing6);
        sideRing2.addChild(topRing2_1);
        sideRing3.addChild(topRing4);
        emitterTip1.addChild(emitterTip2);
        sideRing4.addChild(topRing8_3);
        emitterTip1.addChild(emitterTip8);
        sideBlade1point2.addChild(sideBlade2_1);
        sideRing3.addChild(topRing6);
        sideRing4.addChild(topRing7_3);
        sideRing3.addChild(topRing5);
        sideRing1.addChild(topRing8_2);
        sideRing4.addChild(topRing4_3);
        sideBlade1point2.addChild(sideBlade3_1);
        emitterTip1.addChild(emitterTip3);
        emitterTip1.addChild(emitterTip6);
        darkInnerRing1.addChild(darkInnerRing8);
        body1.addChild(body14);
        sideBlade1point1.addChild(sideBlade3);
        body1.addChild(body12);
        sideRing4.addChild(topRing6_3);
        sideRing4.addChild(topRing3_3);
        sideBlade1point3.addChild(sideBlade3_2);
        innerRing1.addChild(innerRing2);
        sideRing4.addChild(topRing5_3);
        sideRing4.addChild(topRing2_3);
        innerRing1.addChild(innerRing9);
        sideRing3.addChild(topRing8);
        darkInnerRing1.addChild(darkInnerRing6);
        sideRing2.addChild(topRing4_1);
        sideBlade1point3.addChild(sideBlade2_2);
        sideRing2.addChild(topRing7_1);
        sideRing2.addChild(topRing6_1);
        darkInnerRing1.addChild(darkInnerRing5);
        darkInnerRing1.addChild(darkInnerRing3);
        body1.addChild(body3);
        sideRing3.addChild(topRing3);
        sideRing1.addChild(topRing5_2);
        sideRing2.addChild(topRing5_1);
        darkInnerRing1.addChild(darkInnerRing4);
        body1.addChild(body10);
        body1.addChild(body11);
        sideRing2.addChild(topRing3_1);
        sideRing3.addChild(topRing7);
        sideRing1.addChild(topRing3_2);
        innerRing1.addChild(innerRing5);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        sideBlade1point1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(innerRing1.offsetX, innerRing1.offsetY, innerRing1.offsetZ);
        GL11.glTranslatef(innerRing1.rotationPointX * f5, innerRing1.rotationPointY * f5, innerRing1.rotationPointZ * f5);
        GL11.glScaled(0.81D, 1.0D, 0.81D);
        GL11.glTranslatef(-innerRing1.offsetX, -innerRing1.offsetY, -innerRing1.offsetZ);
        GL11.glTranslatef(-innerRing1.rotationPointX * f5, -innerRing1.rotationPointY * f5, -innerRing1.rotationPointZ * f5);
        innerRing1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(sideRing3.offsetX, sideRing3.offsetY, sideRing3.offsetZ);
        GL11.glTranslatef(sideRing3.rotationPointX * f5, sideRing3.rotationPointY * f5, sideRing3.rotationPointZ * f5);
        GL11.glScaled(1.1D, 2.0D, 1.1D);
        GL11.glTranslatef(-sideRing3.offsetX, -sideRing3.offsetY, -sideRing3.offsetZ);
        GL11.glTranslatef(-sideRing3.rotationPointX * f5, -sideRing3.rotationPointY * f5, -sideRing3.rotationPointZ * f5);
        sideRing3.render(f5);
        GL11.glPopMatrix();
        body1.render(f5);
        sideBlade1point3.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(emitterTip1.offsetX, emitterTip1.offsetY, emitterTip1.offsetZ);
        GL11.glTranslatef(emitterTip1.rotationPointX * f5, emitterTip1.rotationPointY * f5, emitterTip1.rotationPointZ * f5);
        GL11.glScaled(-0.37D, 0.93D, -0.37D);
        GL11.glTranslatef(-emitterTip1.offsetX, -emitterTip1.offsetY, -emitterTip1.offsetZ);
        GL11.glTranslatef(-emitterTip1.rotationPointX * f5, -emitterTip1.rotationPointY * f5, -emitterTip1.rotationPointZ * f5);
        emitterTip1.render(f5);
        GL11.glPopMatrix();
        sideBlade1point2.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(darkInnerRing1.offsetX, darkInnerRing1.offsetY, darkInnerRing1.offsetZ);
        GL11.glTranslatef(darkInnerRing1.rotationPointX * f5, darkInnerRing1.rotationPointY * f5, darkInnerRing1.rotationPointZ * f5);
        GL11.glScaled(0.63D, 0.53D, 0.63D);
        GL11.glTranslatef(-darkInnerRing1.offsetX, -darkInnerRing1.offsetY, -darkInnerRing1.offsetZ);
        GL11.glTranslatef(-darkInnerRing1.rotationPointX * f5, -darkInnerRing1.rotationPointY * f5, -darkInnerRing1.rotationPointZ * f5);
        darkInnerRing1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(sideRing1.offsetX, sideRing1.offsetY, sideRing1.offsetZ);
        GL11.glTranslatef(sideRing1.rotationPointX * f5, sideRing1.rotationPointY * f5, sideRing1.rotationPointZ * f5);
        GL11.glScaled(1.1D, 1.0D, 1.1D);
        GL11.glTranslatef(-sideRing1.offsetX, -sideRing1.offsetY, -sideRing1.offsetZ);
        GL11.glTranslatef(-sideRing1.rotationPointX * f5, -sideRing1.rotationPointY * f5, -sideRing1.rotationPointZ * f5);
        sideRing1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(sideRing2.offsetX, sideRing2.offsetY, sideRing2.offsetZ);
        GL11.glTranslatef(sideRing2.rotationPointX * f5, sideRing2.rotationPointY * f5, sideRing2.rotationPointZ * f5);
        GL11.glScaled(1.1D, 2.0D, 1.1D);
        GL11.glTranslatef(-sideRing2.offsetX, -sideRing2.offsetY, -sideRing2.offsetZ);
        GL11.glTranslatef(-sideRing2.rotationPointX * f5, -sideRing2.rotationPointY * f5, -sideRing2.rotationPointZ * f5);
        sideRing2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(sideRing4.offsetX, sideRing4.offsetY, sideRing4.offsetZ);
        GL11.glTranslatef(sideRing4.rotationPointX * f5, sideRing4.rotationPointY * f5, sideRing4.rotationPointZ * f5);
        GL11.glScaled(1.1D, 2.0D, 1.1D);
        GL11.glTranslatef(-sideRing4.offsetX, -sideRing4.offsetY, -sideRing4.offsetZ);
        GL11.glTranslatef(-sideRing4.rotationPointX * f5, -sideRing4.rotationPointY * f5, -sideRing4.rotationPointZ * f5);
        sideRing4.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
