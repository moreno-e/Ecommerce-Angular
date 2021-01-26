package com.moreno.ecommerce.dao;

import com.moreno.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//name of json entry productCat... , reference to path /product-category
@RepositoryRestResource(collectionResourceRel = "productCategory",path ="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
        }
