# Write your MySQL query statement below
select 'Low Salary' as category, count(*) as accounts_count from Accounts
where income < 20000
union all
select 'Average Salary' as category, count(*) as accounts_count from Accounts
where income between 20000 and 50000
union all
select 'High Salary' as category, count(*) as accounts_count from Accounts
where income > 50000
ORDER BY CASE
    WHEN category = 'High Salary' THEN 1
    WHEN category = 'Low Salary' THEN 2
    WHEN category = 'Average Salary' THEN 3
END;
